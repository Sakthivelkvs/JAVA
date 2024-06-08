
package Dump;

import java.util.Scanner;

public class Arms2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();

        for (int i = 1; i <= limit; i++) {
            int sum = 0;
            int num = i; // Use a temporary variable to store the current number
            int temp = num;
            int len = String.valueOf(num).length(); // Get the length of the number

            while (num > 0) {
                int rem = num % 10;
                num /= 10;
                sum += Math.pow(rem, len); // Raise to the power of the number's length
            }

            if (temp == sum) {
                System.out.println("The Armstrong Number is: " + temp);
            }
        }

        sc.close();
    }
}
