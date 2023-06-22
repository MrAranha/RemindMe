package TerminalFeatures;

public class ConsoleColors {
    public static String ANSI_RESET = "\u001B[0m";
    public static String colorReset()
    {
        return ANSI_RESET;
    }

    public static String getReset() {
        return ANSI_RESET;
    }

    public static String getBlack() {
        return ANSI_BLACK;
    }

    public static String getRed() {
        return ANSI_RED;
    }

    public static String getGreen() {
        return ANSI_GREEN;
    }

    public static String getYellow() {
        return ANSI_YELLOW;
    }

    public static String getBlue() {
        return ANSI_BLUE;
    }

    public static String getPurple() {
        return ANSI_PURPLE;
    }

    public static String getCyan() {
        return ANSI_CYAN;
    }

    public static String getWhite() {
        return ANSI_WHITE;
    }

    public static String ANSI_BLACK = "\u001B[30m";
    public static String ANSI_RED = "\u001B[31m";
    public static String ANSI_GREEN = "\u001B[32m";
    public static String ANSI_YELLOW = "\u001B[33m";
    public static String ANSI_BLUE = "\u001B[34m";
    public static String ANSI_PURPLE = "\u001B[35m";
    public static String ANSI_CYAN = "\u001B[36m";
    public static String ANSI_WHITE = "\u001B[37m";
}
