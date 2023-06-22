import TerminalFeatures.ConsoleColors;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
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
    }
}