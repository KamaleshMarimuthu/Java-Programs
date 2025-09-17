// Check whether the character is alphabet, digit or special character

import java.util.Scanner;
public class CharacterType {
    public static void main(String[] args) {
        Scanner ob10 = new Scanner(System.in);
        char ch = ob10.next().charAt(0);

        if (Character.isLetter(ch)) {
            System.out.println("alphabet");
        } else if (Character.isDigit(ch)) {
            System.out.println("digit");
        } else {
            System.out.println("special");
        }
        ob10.close();
    }
}
