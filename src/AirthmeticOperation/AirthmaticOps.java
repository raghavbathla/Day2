package AirthmeticOperation;

import java.util.Scanner;

public class AirthmaticOps {
    public static void main(String[] args) {
        System.out.println("Enter a , b and c");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int result1 = a+b*c;
int result2 = c+a/b;
int result3 = a%b+c;
int result4 =  a*b+c;
System.out.println("Result of first Airthmetic operation is " + result1);

        System.out.println("Result of Second Airthmetic operation is " + result2);
        System.out.println("Result of Third Airthmetic operation is " + result3);
        System.out.println("Result of fourth Airthmetic operation is " + result4);
    }
}
