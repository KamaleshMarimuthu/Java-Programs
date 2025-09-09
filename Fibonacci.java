// Fibonacci Series

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner ob5  = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = ob5.nextInt();
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
