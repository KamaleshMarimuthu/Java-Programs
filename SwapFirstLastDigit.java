// Program to swap the first and last digit of a number

import java.util.Scanner;

public class SwapFirstLastDigit {
 
    public static int swapFirstLast(int n) {
        String num = String.valueOf(n);
        if (num.length() == 1) return n;

        char[] digits = num.toCharArray();
        char temp = digits[0];
        digits[0] = digits[digits.length - 1];
        digits[digits.length - 1] = temp;

        return Integer.parseInt(new String(digits));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Result: " + swapFirstLast(n));
        sc.close();
    }
}



