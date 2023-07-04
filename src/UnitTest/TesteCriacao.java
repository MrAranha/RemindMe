package UnitTest;

import TerminalFeatures.ConsoleColors;
import TextEditor.Editor;
import org.junit.Test;

import java.io.IOException;
import java.io.PrintStream;

import static Files.DeleteFiles.DeleteFile;
import static org.junit.Assert.assertEquals;

public class TesteCriacao {
    private String lastLine;
    @Test
    public void TesteDeletar () throws IOException {
        String result = DeleteFile();
        construct();
        assertEquals("Anotação deletada com sucesso!", result);
    }


    public void construct() {
        System.setOut(new PrintStream(System.out) {
            public void println(String s) {
                lastLine = s;
                super.println(s);
            }
        });
    }
}