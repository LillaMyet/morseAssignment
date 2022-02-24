package morse;

import java.util.Scanner;

public class MorseConverter {
    public static void main(String[] args) {
        Converter converter = new Converter();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Letter or Morsecode: ");

        String input = scan.nextLine();
        String converted = converter.getMorse(input.toUpperCase());
        System.out.println("Translates to: " + converted);
    }
}
