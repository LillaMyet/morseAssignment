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
Skriv ett program som g??r om morsekod till engelska och engelska till morsekod

Skriv programmet med minst en logikklass samt en klass som l??ser in text och skriver ut text (med en main-metod)

Anv??nd den internationella morsekoden (se slide 4)

Utveckla programmet i TDD och skriv minst 3 JUnit-testfall

Skapa minst tv?? felhanteringar i systemet som f??ngar tv?? saker som anv??ndaren kan g??ra som g??r utanf??r det vanliga anv??ndandet av systemet

 */