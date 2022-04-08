
package example;

import java.util.Scanner;
public class Example {

   
    public static void main(String[] args) {
        
   
   int a,b; 
   System.out.println("Enter the numbers:");
   
   Scanner in = new Scanner(System.in);
   
   a=in.nextInt();
   b=in.nextInt();
   
  if(a==b){
      
      System.out.println("a is equal to b"); 
  } 
  else if(b==a){
     System.out.println("b is equal to a"); 
      
  }
}
}