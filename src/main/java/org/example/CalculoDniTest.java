package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculoDniTest {

    @Test
    public void TestIdLetter() {
        char letter = CalculoDni.calculateIDLetter(1557004);
        assertEquals('L', letter);
    }

    @Test
    void testInvalidDniNumbers() {

        try {
            CalculoDni.calculateIDLetter(-1);
            fail("RuntimeException expected for negative ID.");
        } catch (RuntimeException e) {
            assertEquals("Not valid ID -1", e.getMessage(), "Exception message does not match for negative DNI.");
        }

        try {
            CalculoDni.calculateIDLetter(100000000);
            fail("RuntimeException expected for ID too large.");
        } catch (RuntimeException e) {
            assertEquals("Not valid ID 100000000", e.getMessage(), "Exception message does not match for DNI too large.");
        }
    }
}