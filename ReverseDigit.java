//Reverses the digits of an integer

import java.util.Scanner;
public class ReverseDigit {
    
    public static void main(String[] args) {
        Scanner od3 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = od3.nextInt();
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed number: " + reversed);
        od3.close();
    }
}
    

