// binary exponentiation

import java.util.Scanner;


public class Base {
    private long powerRecurive(long base, long exponent) {
        if (exponent == 0) {
            return 1;
        }
        long halfPower = powerRecurive(base, exponent / 2);
        if (exponent % 2 == 1) {
            return halfPower * halfPower * base;
        }
        return halfPower * halfPower;
    }

    // Iterative method for binary exponentiation
    private long powerIterative(long base, long exponent) {
        long result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result *= base;
            }
            base *= base;
            exponent /= 2;
            System.out.printf("Current base: %d, Current exponent: %d, Current result: %d%n", base, exponent, result);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and exponent:");
        long base = sc.nextInt();
        long exponent = sc.nextInt();
        Base b = new Base();
        System.out.printf("Power of %d raised to %d is %d%n", base, exponent, b.powerRecurive(base, exponent));
        System.out.printf("Power of %d raised to %d is %d%n", base, exponent, b.powerIterative(base, exponent));
    }
}