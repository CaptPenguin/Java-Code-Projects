
package polyutil;
/**
 *
 * @author Troy Zelden
 * <pre>
 * Date: March 24th, 2021
 * Course: CSC 1350
 * Lab:7
 * Instructor: Dr. Duncan
 * </pre>
 */

public class PolyUtil {

public static String toString(double[] coeffs){
    String polyStr = "";
    if (coeffs.length == 1) {
        polyStr = polyStr + " "+ coeffs[0];
        return polyStr;
    }
    for (int i = 0; i < coeffs.length - 1; i++){
        if (coeffs[i] != 0){
            if (coeffs[i] > 0 && i > 0){
                polyStr = polyStr + " + ";
            }
            if (coeffs[i] == -1){
                polyStr = polyStr + " -";
            }
            else if (coeffs[i] != 1)
            {
               polyStr = polyStr + " "+ coeffs[i]; 
            }
            polyStr = polyStr + "x";
            if(i < coeffs.length - 1){
               polyStr = polyStr + "^" + (coeffs.length - i - 1) +" ";
        }
      }  
    }
    if (coeffs[coeffs.length - 1] > 0)
    polyStr = polyStr + " + ";
    if (coeffs[coeffs.length - 1] != 0)
    polyStr = polyStr + coeffs[coeffs.length - 1] + " ";
    return polyStr;
}
}
            
       
