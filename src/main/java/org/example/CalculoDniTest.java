package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalculoDniTest {

    @ParameterizedTest
    @CsvSource({
            "12345678, Z",
            "87654321, X",
            "11111111, H",
            "22222222, J",
            "33333333, P",
            "44444444, A",
            "55555555, K",
            "66666666, Q",
            "77777777, B",
            "88888888, Y"
    })
    public void TestIdLetter(int dni, char expectedLetter) {
        char letter = CalculoDni.calculateIDLetter(dni);
        assertEquals(expectedLetter, letter);
    }

    @Test
    void testInvalidDniNumbers() {

        try {
            CalculoDni.calculateIDLetter(-1);
            fail("IllegalArgumentException expected for negative ID.");
        } catch (IllegalArgumentException e) {
            assertEquals("Not valid ID -1", e.getMessage(), "Exception message does not match for negative DNI.");
        }

        try {
            CalculoDni.calculateIDLetter(100000000);
            fail("IllegalArgumentException expected for ID too large.");
        } catch (IllegalArgumentException e) {
            assertEquals("Not valid ID 100000000", e.getMessage(), "Exception message does not match for DNI too large.");
        }
    }
}