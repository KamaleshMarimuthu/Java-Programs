// Print in reverse order for descending

import java.util.Scanner;
import java.util.Arrays;

public class DescendingOrder {
    public static void main(String[] args) {
        Scanner ob7 = new Scanner(System.in);
        int n = ob7.nextInt();
        int[] nums = new int[4];
        for (int i = 0; i < 4; i++) {
            nums[i] = ob7.nextInt();
        }
        Arrays.sort(nums);
   
        for (int i = 3; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
        ob7.close();
    }
}
    
