package FirstProject.src.main.java.com.itexps.shoppingcart.firstproject;

import java.util.Scanner;

public class Fb {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n = s.nextInt();
        System.out.print("Fibonacci Series:");

        for(int i = 1; i <= n; ++i) {
            a = b;
            b = c;
            c += a;
            System.out.print(" " + a + " ");
        }

    }
}
