// to search an element in 2D Array
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.print("Enter rows and columns of array: ");
        Scanner sc= new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int i,j;
        int[][] ele= new int[r][c];
         System.out.print("Enter the elements: ");
         
         for(i=0;i<r;i++){
             for(j=0;j<c;j++){
                 ele[i][j]=sc.nextInt();
             }
         }
        // printing the array
         for(i=0;i<r;i++){
             for(j=0;j<c;j++){
                 System.out.print(ele[i][j]+" ");
             }
            System.out.println(); 
         }
         System.out.print("Enter the element to search: ");
         int st=sc.nextInt();
         int flag=0;
          for(i=0;i<r;i++){
             for(j=0;j<c;j++){
                 if(st==ele[i][j]){
                     flag++;
                 }
             }
          }
        if(flag==1){
           System.out.print(st+" "+"was found."); 
        }
        
    }
}
