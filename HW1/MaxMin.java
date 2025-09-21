package OOP.HW1;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            if (value > max) max = value;
            if (value < min) min = value;
        }
        System.out.println("maximum = " + max + ", minimum = " + min);
        sc.close();
    }
}
