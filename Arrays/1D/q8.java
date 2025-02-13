// wap to check if an array is palindrome or not
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking array input
        System.out.println("Enter the number of array elements: ");
        int n = input.nextInt();
        
        int[] ele = new int[n];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            ele[i] = input.nextInt();
        }

        // Displaying the array
        System.out.println("Displaying Array:");
        for (int i = 0; i < n; i++) {
            System.out.println("ele[" + i + "]: " + ele[i]);
        }

        // Checking if the array is a palindrome
        boolean isPalindrome = true;
        for (int i = 0; i < n; i++) {
        
            if (ele[i] != ele[n - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        if (isPalindrome) {
            System.out.println("The given array is a palindrome.");
        } else {
            System.out.println("The given array is not a palindrome.");
        }

        // Closing Scanner
        input.close();
    }
}
