// calculate minimum and maximum of two numbers
 import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
        Scanner obj8 = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = obj8.nextInt();
        System.out.print("Enter second number: ");
        int b =obj8.nextInt();

        int max = (a > b) ? a : b;
        int min = (a < b) ? a : b;

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        obj8.close();
    }
}
    

