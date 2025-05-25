package com.example.passgen;

public class Alphabet {

    public static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    public static final String NUMBERS = "0123456789";
    public static final String SYMBOLS = "!@#$%^&*()-_=+[]{}|;:'\",.<>?/`~";

    private final String alphabet;

    public Alphabet(boolean includeUpper, boolean includeLower, boolean includeNum, boolean includeSym) {
        StringBuilder sb = new StringBuilder();

        if (includeUpper) sb.append(UPPERCASE_LETTERS);
        if (includeLower) sb.append(LOWERCASE_LETTERS);
        if (includeNum) sb.append(NUMBERS);
        if (includeSym) sb.append(SYMBOLS);

        this.alphabet = sb.toString();
    }

    public String getAlphabet() {
        return alphabet;
    }
}
