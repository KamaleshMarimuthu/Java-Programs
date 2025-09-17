// Sum of even numbers from 1 to n
import java.util.Scanner;

public class SumEven {
    public static void main(String[] args) {
        Scanner od1 = new Scanner(System.in);
        int n = od1.nextInt();
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        System.out.println(sum);
        od1.close();
    }
}

