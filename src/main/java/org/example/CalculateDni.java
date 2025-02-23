package org.example;

public class CalculateDni {

    
    private static final String letters = "TRWAGMYFPDXBNJZSQVHLCKE";

    public static char calculateIDLetter(int idNum) {
        if (idNum < 0 || idNum > 99999999) {
            throw new IllegalArgumentException("Not valid ID " + idNum);
        }
        int rest = idNum % 23;
        return letters.charAt(rest);
    }
}