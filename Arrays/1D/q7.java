// wap to reverse an array
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
        System.out.println("Displaying Array in Reverse:");
         for (int i = n-1; i >= 0; i--) {
            System.out.println("ele[" + i + "]: " + ele[i]);
        }
    }
}

