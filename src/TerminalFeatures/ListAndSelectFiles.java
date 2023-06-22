package TerminalFeatures;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ListAndSelectFiles {
    private static boolean CheckIfSelectionIsAFile(String selection, Map<String, String> Files)
    {
        for(int i = 0; i < Files.length; i++){
            if(Files[i].equals(selection)) {
                return true;
            }
        }
        return false;
    }
    private static Map<String, String> ListFiles(){
        File folder = new File(System.getenv("APPDATA") + "\\" + "Notes");
        String[] pathnames;
        Map<String, String> map = new HashMap<String, String>();

        pathnames = folder.list();
        if(pathnames == null){
            System.out.println(ConsoleColors.getWhite() + "Não há nenhuma anotação em seu computador!" + ConsoleColors.getReset());
            return null;
        }
        System.out.println(ConsoleColors.getWhite() + "===========================" + ConsoleColors.getReset());
        for(int i = 0; i < pathnames.length; i++) {
            map.put(String.valueOf(i), pathnames[i]);
            System.out.println(ConsoleColors.getYellow() + pathnames[i] + ConsoleColors.getReset());
        }
        return map;
    }
    public static void AnnotationSelect() {
        Scanner scanner = new Scanner(System.in);
        String Selected = "";
        Map<String, String> Files = ListFiles();
        System.out.println(ConsoleColors.getRed() + "Por favor selecione uma anotação!" + ConsoleColors.getReset());
        do {
            Selected = scanner.nextLine().trim();
        } while(CheckIfSelectionIsAFile(Selected, Files));
    }
}
