
// Print all even numbers in a given range

import java.util.Scanner;
public class EvenFinder {
    public static void main(String[] args) {
        Scanner od = new Scanner(System.in);
        int start = od.nextInt();
        int end = od.nextInt();

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        od.close();
    }
}
