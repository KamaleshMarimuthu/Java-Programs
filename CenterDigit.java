// Program to find the center digit of a number (returns -1 if even digits)
import java.util.Scanner;

public class CenterDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        String num = String.valueOf(Math.abs(n));
        int len = num.length();
        if (len % 2 == 0) {
            System.out.println(-1);
        } else {
            System.out.println(num.charAt(len / 2) - '0');
        }
        sc.close();
    }
}

