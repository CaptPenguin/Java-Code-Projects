package primefactorizer;
/**
 *
 * @author Troy Zelden
 * 
 * <pre>
 * Date: March 10th, 2021
 * Course: CSC 1350
 * Lab: 6
 * Instructor: Dr. Duncan
 * </pre>
 */
import java.util.Scanner;

public class PrimeFactorizer {

    public static long litOhm(long N)
    {
       int f = 2;
       int currentF = 1;
       int ohm = 0;
       
       while (f <= Math.sqrt(N))
       {
           if (N == 0)
           {
               N = N/f;
             if (currentF != f)
             {
                 currentF = f;
                 ohm = ohm + 1;
             }
           }
           else
               f = f + 1;
       }
       if (N > 1 && f != N)
           ohm = ohm + 1;
       return ohm;
    }
    public static long bigOhm(long N)
    { 
        int f = 2;
        int ohm = 0;
        
        while (f <= Math.sqrt(N))
       {
           if (N == 0)
           {
               N = N/f;
           }
           else
               f = f + 1;
       }
       if (N > 1 && f != N)
           ohm = ohm + 1;
       return ohm;
    }        
 
    public static void main(String[] args) {
     int litOhm;
     int bigOhm;
     Scanner cin = new Scanner(System.in);
     System.out.println();
     int N = cin.nextInt();
    }
}