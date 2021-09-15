package Sumofnnuberusingfor;

import java.util.Scanner;

public class SumOfNNaturalforMain {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum=0;
        for (int i =0; i<=num ; ++i)
        {
            sum+=i;
        }
        System.out.println("Sum of n Natural number is " + sum);
    }
}
