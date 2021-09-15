package SumOfNturalNumnerWhile;

import java.util.Scanner;

public class SumOfnWhileMain {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 0;
        int sum = 0;
        while(i<num){
            i++;
  sum += i;


        }
        System.out.println("Sum of n natural numbers are "  + sum);
    }
}
