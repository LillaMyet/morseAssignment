package morse;

import java.util.HashMap;

public class Converter {

    private HashMap<String, String> morse;

    public Converter() {
        morse = new HashMap<String, String>();

        morse.put("A", "*-");
        morse.put("B", "-***");
        morse.put("C", "-*-*");
        morse.put("D", "-**");
        morse.put("E", "*");
        morse.put("F", "**-*");
        morse.put("G", "--*");
        morse.put("H", "****");
        morse.put("I", "**");
        morse.put("J", "*---");
        morse.put("K", "-*-");
        morse.put("L", "*-**");
        morse.put("M", "--");
        morse.put("N", "-*");
        morse.put("O", "---");
        morse.put("P", "*--*");
        morse.put("Q", "--*-");
        morse.put("R", "*-*");
        morse.put("S", "***");
        morse.put("T", "-");
        morse.put("U", "**-");
        morse.put("V", "***-");
        morse.put("W", "*--");
        morse.put("X", "-**-");
        morse.put("Y", "-*--");
        morse.put("Z", "--**");
        morse.put("1", "*----");
        morse.put("2", "**---");
        morse.put("3", "***--");
        morse.put("4", "****-");
        morse.put("5", "*****");
        morse.put("6", "-****");
        morse.put("7", "--***");
        morse.put("8", "---**");
        morse.put("9", "----*");
        morse.put("0", "-----");
        morse.put(".", "*-*-*-");
        morse.put(",", "--*--");
        morse.put("?", "-**--**");
        morse.put("*-", "A");
        morse.put("-***", "B");
        morse.put("-*-*", "C");
        morse.put("-**", "D");
        morse.put("*", "E");
        morse.put("**-*", "F");
        morse.put("--*", "G");
        morse.put("****", "H");
        morse.put("**", "I");
        morse.put("*---", "J");
        morse.put("-*-", "K");
        morse.put("*-**", "L");
        morse.put("--", "M");
        morse.put("-*", "N");
        morse.put("---", "O");
        morse.put("*--*", "P");
        morse.put("--*-", "Q");
        morse.put("*-*", "R");
        morse.put("***", "S");
        morse.put("-", "T");
        morse.put("**-", "U");
        morse.put("***-", "V");
        morse.put("*--", "W");
        morse.put("-**-", "X");
        morse.put("-*--", "Y");
        morse.put("--**", "Z");
        morse.put("*----", "1");
        morse.put("**---", "2");
        morse.put("***--", "3");
        morse.put("****-", "4");
        morse.put("*****", "5");
        morse.put("-****", "6");
        morse.put("--***", "7");
        morse.put("---**", "8");
        morse.put("----*", "9");
        morse.put("-----", "0");
        morse.put("*-*-*-", ".");
        morse.put("--*--", ",");
        morse.put("-**--**", "?");
    }

    public String getMorse(String testdata) {
        String wrong = morse.get(testdata);

        if (wrong == null) {
            wrong = "Wrong input";
        } else {
            return morse.get(testdata);
        }
        return wrong;
    }
}




/*
Krav:
Skriv ett program som gör om morsekod till engelska och engelska till morsekod

Skriv programmet med minst en logikklass samt en klass som läser in text och skriver ut text (med en main-metod)

Använd den internationella morsekoden (se slide 4)

Utveckla programmet i TDD och skriv minst 3 JUnit-testfall

Skapa minst två felhanteringar i systemet som fångar två saker som användaren kan göra som går utanför det vanliga användandet av systemet

 */