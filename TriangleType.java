//---Troy Zelden---
//CSC-1350, Kundu
package triangletype;
import java.util.Random;
public class TriangleType               
{ int length, length2, length3, minLength0, maxLength0, medianLength;
  String triangleType;
  
  public TriangleType(int minLength, int maxLength, double randomSeed)
  {        
      Random rand = new Random(Math.round(randomSeed));
      length = rand.nextInt((maxLength - minLength) + 1) + minLength;
      length2 = rand.nextInt((maxLength - minLength) + 1) + minLength;
      int minLength3 = Math.abs(length - length2) + 1;
      int maxLength3 = Math.abs(length + length2) - 1;
      if (maxLength3 > maxLength) maxLength3 = maxLength;
      if (minLength3 < minLength) minLength3 = minLength;
      length3 = rand.nextInt((maxLength3 - minLength3) + 1) + minLength3;
      System.out.print("Initially: " + minLength + " <= length = " + length + 
              ", length2 = " + length2 + " <= " + maxLength + " and " +
              minLength3 + " <= length3 = " + length3 + " <= " + maxLength3);
      if(length > length2){
         if(length > length3){maxLength0 = length;
            if(length3 > length2){medianLength = length3; minLength0 = length2;}
            else{minLength0 = length3; medianLength = length2;}}
         else {maxLength0 = length3; medianLength = length; minLength0 = length2;}}
      else if(length2 > length3){
              maxLength0 = length2;
              if(length3 > length){medianLength = length3; minLength0 = length;}
              else{medianLength = length; minLength0 = length3;}
              }
      else{maxLength0 = length3; medianLength = length2; minLength0 = length;}
      System.out.print("\nAfter sorting: length = " + minLength0 + ", length2 = "
                          + medianLength + ", length3 = " + maxLength0);
  }
  public void triangleType(){
    if(length == length2)
        if(length == length3)triangleType = "equilateral";
        else triangleType = "isosceles";
    else if(length2 == length3)triangleType = "isosceles";
    else if(length == length3)triangleType = "isosceles";
    else triangleType = "scalene";
    System.out.println("\nThe triangle (" + minLength0 + ", " + medianLength + 
                          ", " + maxLength0 + ") is " + triangleType + ".");
    System.out.println(); 
  }        
    public static void main(String[] args) {
    for(int i = 0; i < 5; i++)
      (new TriangleType(4, 20, i*1.0)).triangleType();
    (new TriangleType(4, 4, 1.0)).triangleType();
    }  
}