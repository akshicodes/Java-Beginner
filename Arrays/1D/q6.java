// wap to return a new array after deleting a specific element
import java.util.Scanner;

class DeleteElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter the element to delete: ");
        int elementToDelete = input.nextInt();

        // Count occurrences of the element
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == elementToDelete) {
                count++;
            }
        }

        // If element is not found, print message and exit
        if (count == 0) {
            System.out.println("Element not found in the array.");
        } else {
            // Create a new array of reduced size
            int[] newArr = new int[n - count];
            int index = 0;

            // Copy elements except the one to delete
            for (int i = 0; i < n; i++) {
                if (arr[i] != elementToDelete) {
                    newArr[index++] = arr[i];
                }
            }

            // Display the new array
            System.out.print("New array after deletion: ");
            for (int i = 0; i < newArr.length; i++) {
                System.out.print(newArr[i] + " ");
            }
        }

        input.close();
    }
}
