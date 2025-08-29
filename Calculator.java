
// Calculator Program
import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner ob1 = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = ob1.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = ob1.nextDouble();
        System.out.print("Enter operation (+,-,*,/): ");
        char op = ob1.next().charAt(0);
        double res = 0;
        switch (op) {
            case '+': res= num1 + num2; break;
            case '-': res = num1 - num2; break;
            case '*': res = num1 * num2; break;
            case '/': res = num1 / num2; break;
            default: System.out.println("Invalid operator"); return;
        }
        System.out.println("The Result is: " + res);
    }
}


