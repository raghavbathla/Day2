package Reversenumberusingwhile;

import java.util.Scanner;

public class ReverseNumMain {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int rev_num = 0;
        while (num > 0)
        {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("Reverse of a number is " + rev_num);
    }
}
