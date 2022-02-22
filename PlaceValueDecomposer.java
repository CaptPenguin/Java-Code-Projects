/**
 *
 *@author Troy Zelden
 *<pre>
 *Date:February 24th, 2021
 *Course: CSC1350 Section: 01
 *Lab: 4 <br>
 *Instructor: Dr. Duncan<br>
 *</pre>
 */
package placevaluedecomposer;
import java.util.Scanner;
public class PlaceValueDecomposer 
{       
    public static void main(String[] args) 
    {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter a non-negative integer -> ");
        long num = cin.nextInt();
        if (num < 0)
        System.out.printf("Error: Input must be a non-negative integer.");
        else if(num >= 0 && num <= 9)
        System.out.printf(num + " = " + num);
        else if(num >= 10 && num <= 99)
        {  
           String numberAsString = "" + num;
           char digit = numberAsString.charAt(0);
           char digit2 = numberAsString.charAt(1);
           if (digit2 == 0)
           
                 
           System.out.printf(num + " = " + digit + " x 10 + " + digit2);
        }
        
        
    
        
    }
}
