package OOP.HW1;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        double dist = Math.sqrt(x * x + y * y);
        System.out.println(dist);
        sc.close();
    }
}
