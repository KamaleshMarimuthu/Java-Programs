
//Find triangle shape
import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner obj9 = new Scanner(System.in);
        int a = obj9.nextInt();
        int b = obj9.nextInt();
        int c = obj9.nextInt();

        if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
        obj9.close();
    }
}
