// Find number of occurences of an element
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
          
           System.out.print("enter the element to find occurence: ");
           int st= input.nextInt();
           int f=0;
           
           for(i=0;i<n;i++){
               if(ele[i]==st)
               f++;
           }
           
            System.out.print("number of occurences of the element are: "+ f);
    }
}
