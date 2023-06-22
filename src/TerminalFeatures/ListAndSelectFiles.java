package TerminalFeatures;

import java.io.File;

public class ListAndSelectFiles {
    public static String[] ListFiles(){
        System.out.println("");
        File folder = new File(System.getenv("APPDATA") + "\\" + "Notes");
        String[] pathnames;
        pathnames = folder.list();
        if(pathnames == null){
            System.out.println(ConsoleColors.getWhite() + "Não há nenhuma anotação em seu computador!" + ConsoleColors.getReset());
            return null;
        }

        for(int i = 0; i < pathnames.length; i++) {
            System.out.println(ConsoleColors.getYellow() + pathnames[i] + ConsoleColors.getReset());
        }
        return pathnames;
    }


}
