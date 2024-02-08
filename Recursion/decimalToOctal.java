package Recursion;

import java.util.Scanner;

public class decimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();

        int result = decimalOctal(n);
        System.out.println("Octal equivalent: " + result);
        sc.close();
    }

    public static int decimalOctal(int n) {
        if (n == 0) {
            return 0;                      
        } else {
            return decimalOctal(n / 8) * 10 + n % 8;
        }
    }
}