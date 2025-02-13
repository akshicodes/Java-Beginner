// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("enter thr number of elements: ");
        int n= input.nextInt();
         System.out.print("enter the elements: ");
          int[] ele= new int[n];
          
          int i;
          for(i=0;i<n;i++){
              ele[i]=input.nextInt();
          }
          //printing the array
          
          for(i=0;i<n;i++){
              System.out.print("ele[i]:"+ ele[i]+"\t"+"\n");
          }
           System.out.println("\n");
          
           int sum=0;
            for(i=0;i<n;i++){
                sum= sum+ ele[i];
            }
             System.out.println("Sum of all the array elements is:"+ sum);
            
            
    }
}