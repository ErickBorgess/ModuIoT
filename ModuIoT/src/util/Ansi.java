package util;

public final class Ansi {
    private Ansi() {}

    public static final String RESET  = "\u001B[0m";
    public static final String PRETO  = "\u001B[30m";
    public static final String BRANCO = "\u001B[37m";

    public static final String BG_PRETO  = "\u001B[40m";
    public static final String BG_BRANCO = "\u001B[47m";
}
