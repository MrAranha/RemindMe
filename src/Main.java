import TerminalFeatures.ConsoleColors;
import TextEditor.Editor;
import UnitTest.TesteCriacao;

import java.io.IOException;
import java.util.Scanner;

import static Files.DeleteFiles.DeleteFile;
import static Files.ReadAnnotationFiles.AnnotationRead;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String Selected = "";
        System.out.println(ConsoleColors.getCyan() + "1 -> Ver Anotações" + ConsoleColors.getReset());
        System.out.println(ConsoleColors.getGreen() + "2 -> Criar uma anotação" + ConsoleColors.getReset());
        System.out.println(ConsoleColors.getRed() + "3 -> Deletar uma anotação" + ConsoleColors.getReset());
        System.out.println(ConsoleColors.getRed() + "4 -> Teste unitário" + ConsoleColors.getReset());
        while(!Selected.equals("1") && !Selected.equals("2") && !Selected.equals("3") && !Selected.equals("4")){
            Selected = scanner.nextLine().trim();
        }
        switch(Selected){
            case "1":
                AnnotationRead();
                break;
            case "2":
                Editor newEditor = new Editor();
                break;
            case "3":
                DeleteFile();
                break;
            case "4":
                TesteCriacao testeCriacao = new TesteCriacao();
                testeCriacao.TesteDeletar();
                break;
            default:
                break;
        }
    }
}