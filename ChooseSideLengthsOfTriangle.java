//---Troy Zelden---
//CSC-1350, Kundu
package choosesidelengthsoftriangle;
import java.util.Scanner;
public class ChooseSideLengthsOfTriangle 
{ final int length, length2;
  public ChooseSideLengthsOfTriangle()
  {   Scanner scan = new Scanner(System.in);
      System.out.print("Enter two integers (> 0 and < 9) for lengths of two sides of a triangle: ");
      length = scan.nextInt();
      length2 = scan.nextInt();
      System.out.println("You enter lengths " + length + " and " + length2 + ".\n");
  }
  public void choose3rdSideLength()
  {   int minLength3 = Math.abs(length - length2) + 1;
      int maxLength3 = Math.abs(length + length2) - 1;
      String promptStr = ("triangle's 3rd side length (>= " + minLength3 + " and <= " + maxLength3 + "): ");
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter an integer for " + promptStr);
      int length3 = scan.nextInt();
      if (maxLength3>=length3 && length3>=minLength3)
      {   System.out.println("A triangle exists with sides of lengths: (" + length + ", " + length2 + ", " + length3 + ")");
          System.out.println("");
      }
       else if (maxLength3<=length3)
       {    System.out.println("The 3rd side length = " + length3 + " is too large.");
            System.out.print("REENTER " + promptStr);
            length3 = scan.nextInt();
            if (maxLength3>=length3 && length3>=minLength3)
            {   System.out.println("A triangle exists with sides of lengths: (" + length + ", " + length2 + ", " + length3 + ")");
                System.out.println("");
            }
       }      
       else
       {   System.out.println("The 3rd side length = " + length3 + " is too small.");
           System.out.print("REENTER " + promptStr);
           length3 = scan.nextInt();
           if (maxLength3>=length3 && length3>=minLength3)
           {   System.out.println("A triangle exists with sides of lengths: (" + length + ", " + length2 + ", " + length3 + ")");
               System.out.println("");
           }     
           else if (maxLength3<=length3)   
           {    System.out.println("*** Ending session. The 3rd side length = " + length3 + " is too large.");
           }
           else
           {    System.out.println("*** Ending session. The 3rd side length = " + length3 + " is too small.");
           }             
       }
  }      
    public static void main(String[] args) 
    {   ChooseSideLengthsOfTriangle cslot = new ChooseSideLengthsOfTriangle();
       cslot.choose3rdSideLength();
       cslot.choose3rdSideLength();
       cslot.choose3rdSideLength();
       cslot.choose3rdSideLength();
    }   
}
