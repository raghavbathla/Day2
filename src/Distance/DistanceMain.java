package Distance;

import java.util.Scanner;

public class DistanceMain {
    public static void main(String[] args) {
        System.out.println("Enter x and y");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        double dis = Math.sqrt(Math.pow(x,x)+Math.pow(y,y));
System.out.println("The Distance is " + dis);

    }

}
