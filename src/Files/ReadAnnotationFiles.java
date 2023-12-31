package Files;

import DTO.FilesDTO;
import TerminalFeatures.ConsoleColors;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Files.ListAndSelectFiles.CheckIfSelectionIsAFile;
import static Files.ListAndSelectFiles.ListFiles;

public class ReadAnnotationFiles {
    public static void AnnotationRead() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String Selected = "";
        ArrayList<FilesDTO> FilesDTOList = ListFiles();
        if(FilesDTOList == null)
            return;
        System.out.println(ConsoleColors.getRed() + "Por favor selecione uma anotação para visualizar!" + ConsoleColors.getReset());
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
