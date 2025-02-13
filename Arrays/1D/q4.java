// BUBBLE SORT
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
          
           for(i=0;i<n-1;i++){ //no. of passes
               for(int j=0;j<n-i-1;j++){
                   if(ele[j]> ele[j+1]){
                       
                   
                       int t= ele[j+1];
                       ele[j+1]=ele[j];
                       ele[j]= t;
                   }
               }
           } 
            for(i=0;i<n;i++){
              System.out.print("ele[i]:"+ ele[i]+"\t"+"\n");
          }
           System.out.println("\n");
          
           
            
            
    }
}
