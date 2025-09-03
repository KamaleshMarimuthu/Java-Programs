//Check whether given string is Palindrome

import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        Scanner sd = new Scanner(System.in);
        System.out.print("Enter text: ");
        String inp = sd.nextLine();
        String rev = new StringBuilder(inp).reverse().toString();
        if (inp.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

}
