package org.example;

import java.util.Arrays;
import java.util.List;

public class CalculoDni {

    public static char calculateIDLetter(int idNum) {
        List<String> letters = Arrays.asList("T", "R", "W",
        "A", "G", "M", "Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E");
        char response = 0;
        if (idNum < 0 || idNum >= 99999999) {
           throw new IllegalArgumentException("Not valid ID " + idNum);
        } else {
            int rest = idNum % 23;
           response = letters.get(rest).charAt(0);
        }
        return response;
    }
}

