package TerminalFeatures;

import DTO.FilesDTO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.nio.file.Paths;

public class ListAndSelectFiles {
    private static boolean CheckIfSelectionIsAFile(String Selection, ArrayList<FilesDTO> FilesDTOList)
    {
        for(int i = 0; i < FilesDTOList.size(); i++){
            String PathNum = String.valueOf(FilesDTOList.get(i).getFileNumberMapping());
            if(PathNum.equals(Selection)) {
                return true;
            }
        }
        return false;
    }
    private static ArrayList<FilesDTO> ListFiles(){
        File folder = new File(System.getenv("APPDATA") + "\\" + "Notes");
        String[] RawPathnames;
        ArrayList<FilesDTO> FilesDTOList = new ArrayList<FilesDTO>();

        RawPathnames = folder.list();
        if(RawPathnames == null){
            System.out.println(ConsoleColors.getWhite() + "Não há nenhuma anotação em seu computador!" + ConsoleColors.getReset());
            return null;
        }
        System.out.println(ConsoleColors.getWhite() + "===========================" + ConsoleColors.getReset());
        for(int i = 1; i <= RawPathnames.length; i++) {
            FilesDTO File = new FilesDTO();
            Path name = Paths.get(RawPathnames[i]);
            File.setFileName(name.getFileName().toString());
            File.setFilePath(RawPathnames[i]);
            File.setFileNumberMapping(i);
            FilesDTOList.add(File);
            System.out.println(ConsoleColors.getYellow() + i + " - " +RawPathnames[i] + ConsoleColors.getReset());
        }
        return FilesDTOList;
    }
    public static void AnnotationSelect() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String Selected = "";
        ArrayList<FilesDTO> FilesDTOList = ListFiles();
        if(FilesDTOList == null)
            return;
        System.out.println(ConsoleColors.getRed() + "Por favor selecione uma anotação!" + ConsoleColors.getReset());
        do {
            Selected = scanner.nextLine().trim();
        } while(!CheckIfSelectionIsAFile(Selected, FilesDTOList));
        FilesDTO selectedFile = FilesDTOList.get(Integer.parseInt(Selected));
        Path filePath = Paths.get(System.getenv("APPDATA") + "\\" + "Notes" + "\\" + selectedFile.getFileName());

        List<String> lines = Files.readAllLines(filePath, StandardCharsets.UTF_8);

        lines.forEach(line ->
                System.out.println(ConsoleColors.getGreen() + line + ConsoleColors.getReset()));
    }
}
