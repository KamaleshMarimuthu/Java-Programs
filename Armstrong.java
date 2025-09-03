//Armstrong number checker
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int org = num;
        int result = 0;
        int val = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;                
            result += Math.pow(digit, val);            
            num /= 10;                            
        }

        if (result == org) {
            System.out.println(org + " Armstrong number.");
        } else {
            System.out.println(org + " Not an Armstrong number.");
        }
    }
}

    

