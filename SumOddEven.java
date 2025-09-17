
// Calculates the sum of odd and even numbers from 1 to N
import java.util.Scanner;

public class SumOddEven {
    public static void main(String[] args) {
        Scanner od2 = new Scanner(System.in);
        int n = od2.nextInt();
        int sumOdd = 0, sumEven = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println(sumOdd + " " + sumEven);
        od2.close();
    }
}
    

