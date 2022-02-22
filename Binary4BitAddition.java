//---Troy Zelden---
//CSC-1350, Kundu
package binary4bitaddition;
import java.util.Scanner;
public class Binary4BitAddition 
{ static int b13, b12, b11, b10, b23, b22, b21, b20;
  static Scanner scan = new Scanner(System.in);
  
  public static void readInput()
  {
   System.out.println("Enter two 4-bit binary numbers seperated by \" : \""
                       + "\n   and a space between the bits: ");
   b13 = scan.nextInt();
   b12 = scan.nextInt();
   b11 = scan.nextInt();
   b10 = scan.nextInt();
   
   scan.next();
   
   b23 = scan.nextInt();
   b22 = scan.nextInt();
   b21 = scan.nextInt();
   b20 = scan.nextInt();
  }
  
  public static int binaryToDecimal(int b3, int b2, int b1, int b0)
  {        
  return((-8 * b3) + (4 * b2) + (2 * b1) + b0);
  }        
  public static void add4BitBinaryNumsAndPrint()        
  {
      int b0, b1, b2, b3, c;
      
      b0 = b10 + b20;
      c = b0 / 2;
      b0 = b0 % 2;
      
      b1 = c + b11 + b21;
      c = b1 / 2;
      b1 = b1 % 2;
      
      b2 = c + b12 + b22;
      c = b2 / 2;
      b2 = b2 % 2;
      
      b3 = c + b13 + b23;
      c = b3 / 2;
      b3 = b3 % 2;
      
      int sum = binaryToDecimal(b3, b2, b1, b0);
      System.out.println("Binary Sum: " + b3 + " " + b2 + " " + b1 + " " + b0 + " = " + sum);
  }
  
  public static void main(String[] args)
  {
      for (int i = 0; i < 5; i++)
      {   readInput();
          int first = binaryToDecimal(b13, b12, b11, b10);
          int second = binaryToDecimal(b23, b22, b21, b20);
          System.out.println("1st 4-bit binary input number: " + b13 + " " + b12 + " " + b11 + " " + b10 + " = " + first);
          System.out.println("2nd 4-bit binary input number: " + b23 + " " + b22 + " " + b21 + " " + b20 + " = " + second);
          add4BitBinaryNumsAndPrint();
      }
      scan.close();
  }                   
}
