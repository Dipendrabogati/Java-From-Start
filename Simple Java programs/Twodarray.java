import java.util.Scanner;



class Arraytwod{

  public static void main(String args[]){

  Scanner scanner = new Scanner(System.in);

  int arr[][]=new int[2][2];
  
  System.out.println("Enter Array Element :  ");
 
  
   for(int i=0;i<2;i++){

        for( int j=0;j<2;j++){

       
    arr[i][j]=scanner.nextInt();

        }

      }
   
 
   for(int i=0;i<2;i++){

         for( int j=0;j<2;j++){

       
     System.out.print(arr[i][j]+" ");

         }

        System.out.println();
      } 
 }
}