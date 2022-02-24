package morse;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMorse {

    @Test
    public void testEtostar() {
        Converter converter = new Converter();

        String testdata = "E";
        String actual = converter.getMorse(testdata);

        assertEquals("*", actual);
    }

    @Test
    public void testSToStars() {
        Converter converter = new Converter();

        String testdata = "S";
        String actual = converter.getMorse(testdata);

        assertEquals("***", actual);
    }

    @Test
    public void testAToMorse() {
        Converter converter = new Converter();

        String testdata = "A";
        String actual = converter.getMorse(testdata);

        assertEquals("*-", actual);
    }

    @Test
    public void testStarToE() {
        Converter converter = new Converter();

        String testdata = "*";
        String actual = converter.getMorse(testdata);

        assertEquals("E", actual);
    }

    @Test
    public void testWrongInput() {
        Converter converter = new Converter();

        String testdata = "Å";
        String actual = converter.getMorse(testdata);

        assertEquals("Wrong input", actual);
    }

    @Test
    public void enterToManyLetters() {
        Converter converter = new Converter();

        String testdata = "HEJ";
        String actual = converter.getMorse(testdata);

        assertEquals("Wrong input", actual);
    }

    @Test
    public void lowerToUppercase() {
        Converter converter = new Converter();

        String testdata = "a";
        String actual = converter.getMorse(testdata.toUpperCase());

        assertEquals("*-", actual);

    }

}
