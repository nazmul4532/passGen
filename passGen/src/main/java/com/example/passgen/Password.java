package com.example.passgen;

public class Password {
    private String value;
    private int length;

    public Password(String s) {
        value = s;
        length = s.length();
    }

    public int CharType(char C) {
        int val;

        // Char is Uppercase Letter (A-Z)
        if (C >= 'A' && C <= 'Z')
            val = 1;
            // Char is Lowercase Letter (a-z)
        else if (C >= 'a' && C <= 'z') {
            val = 2;
        }
        // Char is Digit (0-9)
        else if (C >= '0' && C <= '9') {
            val = 3;
        }
        // Char is Symbol
        else {
            val = 4;
        }
        return val;
    }

    public int PasswordStrength() {
        String s = this.value;
        boolean usedUpper = false;
        boolean usedLower = false;
        boolean usedNum = false;
        boolean usedSym = false;
        int type;
        int score = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            type = CharType(c);

            if (type == 1) usedUpper = true;
            if (type == 2) usedLower = true;
            if (type == 3) usedNum = true;
            if (type == 4) usedSym = true;
        }

        if (usedUpper) score += 1;
        if (usedLower) score += 1;
        if (usedNum) score += 1;
        if (usedSym) score += 1;

        if (s.length() >= 8) score += 1;
        if (s.length() >= 16) score += 1;

        return score;
    }

    public String calculateScore() {
        int score = this.PasswordStrength();

        if (score == 6) {
            return "This is a very good password :D check the Useful Information section to make sure it satisfies the guidelines";
        } else if (score >= 4) {
            return "This is a good password :) but you can still do better";
        } else if (score >= 3) {
            return "This is a medium password :/ try making it better";
        } else {
            return "This is a weak password :( definitely find a new one";
        }
    }

    @Override
    public String toString() {
        return value;
    }
}
