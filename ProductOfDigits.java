// Program to find the product of digits of a number

import java.util.Scanner;
public class ProductOfDigits {
    public static int productOfDigits(int n) {
        if (n == 0) return 0;
        int product = 1;
        n = Math.abs(n);
        while (n > 0) {
            product *= n % 10;
            n /= 10;
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner od5=new Scanner(System.in);
        int x=od5.nextInt();
        int y=od5.nextInt();
        System.out.println(productOfDigits(x)); 
        System.out.println(productOfDigits(y)); 
    }
}

    


