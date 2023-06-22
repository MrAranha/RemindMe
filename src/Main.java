import TerminalFeatures.ConsoleColors;
import TerminalFeatures.ListAndSelectFiles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Selected = "";
        System.out.println(ConsoleColors.getCyan() + "1 -> Ver Anotações" + ConsoleColors.getReset());
        System.out.println(ConsoleColors.getGreen() + "2 -> Criar uma anotação" + ConsoleColors.getReset());
        System.out.println(ConsoleColors.getRed() + "3 -> Deletar uma anotação" + ConsoleColors.getReset());
        while(!Selected.equals("1") && !Selected.equals("2") && !Selected.equals("3")){
            Selected = scanner.nextLine().trim();
        }
        switch(Selected){
            case "1":
                ListAndSelectFiles.ListFiles();
                break;
            case "2":
                break;
            case "3":
                break;
            default:
                break;
        }
    }
}