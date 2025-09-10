// WordCounter

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner obj6 = new Scanner(System.in);
        System.out.println("Enter a sentences :");
        String text = obj6.nextLine();
        String[] words = text.trim().split("\\s+");
        System.out.println("Total words: " + words.length);
        obj6.close();
    }
}

    

