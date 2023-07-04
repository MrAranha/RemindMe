package Files;

import DTO.FilesDTO;
import TerminalFeatures.ConsoleColors;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.nio.file.Paths;

import static Files.ListAndSelectFiles.CheckIfSelectionIsAFile;
import static Files.ListAndSelectFiles.ListFiles;

public class DeleteFiles {
    public static String DeleteFile() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String Selected = "";
        ArrayList<FilesDTO> FilesDTOList = ListFiles();
        if(FilesDTOList == null)
            return "";
        System.out.println(ConsoleColors.getRed() + "Por favor selecione uma anotação para deletar!" + ConsoleColors.getReset());
        do {
            Selected = scanner.nextLine().trim();
        } while(!CheckIfSelectionIsAFile(Selected, FilesDTOList));
        FilesDTO selectedFile = FilesDTOList.get(Integer.parseInt(Selected));
        Path filePath = Paths.get(System.getenv("APPDATA") + "\\" + "Notes" + "\\" + selectedFile.getFileName());
        Files.delete(filePath);
        System.out.println(ConsoleColors.getGreen() + "Anotação deletada com sucesso!" + ConsoleColors.getReset());
        return "Anotação deletada com sucesso!";
    }
}

