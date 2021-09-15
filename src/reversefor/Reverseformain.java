package reversefor;

import java.util.Scanner;

public class Reverseformain {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int rev_num = 0;
        for(int i =num; i>0 ; i = num){
            rev_num = rev_num * 10 + num % 10;
            num = num/10;
        }
        System.out.println("Reverse of number is " + rev_num);
    }
}
