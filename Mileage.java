    //Mileage Remuneration Calculator
    import java.util.Scanner;
    public class Mileage {

    public static void main(String[] args) {
        Scanner obj7 = new Scanner(System.in);
        System.out.print("Enter miles traveled: ");
        int miles = obj7.nextInt();
        System.out.print("Enter rate per mile: ");
        double rate = obj7.nextDouble();
        double kms = miles * 1.60934;
        double remuneration = miles * rate;

        System.out.println(miles + " miles is " + kms + " kms.");
        System.out.println("Total remuneration: " + remuneration);
        obj7.close();
    }
}
    

