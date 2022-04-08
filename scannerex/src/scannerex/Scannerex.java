

package scannerex;

import java.util.Scanner;

class Scannerex {
    
   public static void main(String args[]){
         
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter name,age and salary:");
   
    String name = input.nextLine();
    int age= input.nextInt();
    double salary= input.nextDouble();
    
    System.out.println("Name:"+ name);
    System.out.println("Age:"+ age);
    System.out.println("Salary:"+ salary);

      }
    }
    

