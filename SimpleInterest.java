// Simple Interest Calculator

import java.util.Scanner;
class SimpleInterest {
    public static void main(String[] args) {
        Scanner ob2 = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double p = ob2.nextDouble();
        System.out.print("Enter rate of Interest: ");
        double r = ob2.nextDouble();
        System.out.print("Enter time period(years): ");
        double t = ob2.nextDouble();
        double simp = (p * r * t) / 100;
        System.out.println("Simple Interest: " + simp);
    }
}

    

