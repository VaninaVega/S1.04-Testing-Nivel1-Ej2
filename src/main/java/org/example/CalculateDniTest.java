
package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalculateDniTest {

    @ParameterizedTest
    @CsvSource({
            //Normal cases
            "12345678, Z",
            "52694436, X",
            "28771125, B",
            "47913848, H",
            "30332192, E",
            "18345084, P",
            "89012345, E",
            "24462905, J",
            "30609502, K",
            "56838824, M",
            //Limit cases
            "0, T",            // Mínimo válido
            "1, R",            // Justo después del mínimo
            "99999999, R",     // Máximo válido
            "99999998, T"      // Justo antes del máximo

    })
     void calculateLetterTest(int dni, char expectedLetter) {
        char letter = CalculateDni.calculateIDLetter(dni);
        assertEquals(expectedLetter, letter);
    }

    @Test
    void testInvalidDniNumbers() {
        assertEquals("Not valid ID -1",
                assertThrows(IllegalArgumentException.class, () -> CalculateDni.calculateIDLetter(-1)).getMessage());

        assertEquals("Not valid ID 100000000",
                assertThrows(IllegalArgumentException.class, () -> CalculateDni.calculateIDLetter(100000000)).getMessage());
    }
}



