package placevalue;

import java.util.Scanner;

public class PlaceValueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        if(num == 1)
        {
            System.out.println("unit");
        }
        else if (num == 10){
            System.out.println("tens");
        }
        else if (num == 100){
            System.out.println("hundred");
        }
        else if (num == 1000){
            System.out.println("Thousand");
        }
        else {
            System.out.println("Please enter correct value");
        }
    }
}
