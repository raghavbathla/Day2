package CheckVovelConcon;

import java.util.Scanner;

public class CheckVowelConstMain {
    public static void main(String[] args) {
        System.out.println("Enter a Character");
        Scanner scanner = new Scanner(System.in);
        String num =scanner.nextLine();
        switch (num){
            case "a":
                System.out.println("It is a vowel");
                break;
            case "e":
                System.out.println("It is a vowel");
                break;
            case "i":
                System.out.println("It is a vowel");
                break;
            case "o":
                System.out.println("It is a vowel");
                break;
            case "u":
                System.out.println("It is a vowel");
                break;
            default:
                System.out.println("It is a consonent");
        }
    }
}
