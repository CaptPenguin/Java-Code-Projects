//---Troy Zelden---
//CSC-1350, Kundu
package binaryaddition3;
import java.io.*;
import java.util.*;
public class BinaryAddition3
{ final int[] binaryNum, binaryNum2,
              powerOf2Factors;
  public BinaryAddition3(int numBits, int num, int num2)
  { powerOf2Factors = new int[numBits];
    powerOf2Factors[numBits - 1] = 1;
    for (int i = numBits - 2; i >= 0; i--) 
        powerOf2Factors[i] = 2 * powerOf2Factors[i+1];
    int maxInt = powerOf2Factors[0] - 1;
    binaryNum = decimalToBinary(num, numBits, maxInt); 
    System.out.println("\nbinaryNum     : " + Arrays.toString(binaryNum) +
                       " of num = " + num); 
    binaryNum2 = decimalToBinary(num2, numBits, maxInt); 
    System.out.println("binaryNum2    : " + Arrays.toString(binaryNum2) +
                       " of num2 = " + num2);
  }
  public static int[] decimalToBinary(int number, int numBits, int maxValue) 
  { int[] binaryNum = new int[numBits];
    if (number < 0) 
       { number += maxValue + 1; binaryNum[0] = 1; }
    for (int i = numBits - 1; number > 0; number /= 2, i--)
        binaryNum[i] = number % 2;
    return (binaryNum);
  }
  public int binaryToDecimal(int[] binaryNum)
  { int number = 0;
    for (int i = binaryNum.length - 1; i > 0; i--)
        if (1 == binaryNum[i]) number += powerOf2Factors[i];
    if (1 == binaryNum[0]) number -= powerOf2Factors[0];
    return (number);
  }
  public int[] addBinaryNums()
  { int carry = 0, bitSum, binarySum[] = new int[binaryNum.length];
    for (int i = binaryNum.length - 1; i >= 0; i--)
    {   bitSum = carry + binaryNum[i] + binaryNum2[i];
        carry = bitSum / 2;
        binarySum[i] = bitSum % 2;
    }
    return (binarySum);
  }
  public static int[] binaryMinus(int[] binaryNum)
  { int minusBinaryNum[] = new int[binaryNum.length];
    int posnRightmostOne = -1;
    for (int i = binaryNum.length - 1; i >= 0; i--)
    { if (binaryNum[i] == 1)
    {posnRightmostOne = i;
    break;}
    }
    for (int i = binaryNum.length - 1; i >= 0; i--)
    { if (i >= posnRightmostOne)
        minusBinaryNum[i] = binaryNum[i];
      if (i < posnRightmostOne)
        minusBinaryNum[i] = (binaryNum[i] + 1) % 2;
    }
    return minusBinaryNum;
  }
  public static void testAddition()
  { int num, num2, sum, numBits = 6,
        integerPairs[][] = {{-15, -20}, {0, 16}, {-32, 17}, {-17, 31}, {-13, -19}};
    for (int i = 0; i < integerPairs.length; i++)
    {   num = integerPairs[i][0];
        num2 = integerPairs[i][1];
        BinaryAddition3 ba2 =  new BinaryAddition3(numBits, num, num2);
        int[] binarySum = ba2.addBinaryNums();
        sum = ba2.binaryToDecimal(binarySum);
        System.out.print("minusBinaryNum: " + Arrays.toString(binarySum) +
                         "; its decimal form is " + sum);
        if (num + num2 == sum)
           System.out.println(" = num + num2"); 
        else System.out.println(" != num + num2"); 
    }
  }
  public static void testMinus()
  { int numBits = 6, nums[] = {-15, 15, -20, 0, 16, -32, 17, 31, -13, -19};
    for (int i =0; i < nums.length; i++)
    { BinaryAddition3 ba3 = new BinaryAddition3(numBits, nums[i], -nums[i]);
      int[] minusBinaryNum = ba3.binaryMinus(ba3.binaryNum);
      System.out.print("minusBinaryNum: " + Arrays.toString(minusBinaryNum));
      for (int j = 0; j < minusBinaryNum.length; j++)
          if (minusBinaryNum[j] != ba3.binaryNum2[j])
          {System.out.println(" (from binaryNum) != binaryNum2");
          break;}
      System.out.println(" (from binaryNum) = binaryNum2");
          }
   }
  public static void main(String args[]) 
  { testMinus();
  }
}


/*Program Output

binaryNum     : [1, 1, 0, 0, 0, 1] of num = -15
binaryNum2    : [0, 0, 1, 1, 1, 1] of num2 = 15
minusBinaryNum: [0, 0, 1, 1, 1, 1] (from binaryNum) = binaryNum2

binaryNum     : [0, 0, 1, 1, 1, 1] of num = 15
binaryNum2    : [1, 1, 0, 0, 0, 1] of num2 = -15
minusBinaryNum: [1, 1, 0, 0, 0, 1] (from binaryNum) = binaryNum2

binaryNum     : [1, 0, 1, 1, 0, 0] of num = -20
binaryNum2    : [0, 1, 0, 1, 0, 0] of num2 = 20
minusBinaryNum: [0, 1, 0, 1, 0, 0] (from binaryNum) = binaryNum2

binaryNum     : [0, 0, 0, 0, 0, 0] of num = 0
binaryNum2    : [0, 0, 0, 0, 0, 0] of num2 = 0
minusBinaryNum: [0, 0, 0, 0, 0, 0] (from binaryNum) = binaryNum2

binaryNum     : [0, 1, 0, 0, 0, 0] of num = 16
binaryNum2    : [1, 1, 0, 0, 0, 0] of num2 = -16
minusBinaryNum: [1, 1, 0, 0, 0, 0] (from binaryNum) = binaryNum2

binaryNum     : [1, 0, 0, 0, 0, 0] of num = -32
binaryNum2    : [1, 0, 0, 0, 0, 0] of num2 = 32
minusBinaryNum: [1, 0, 0, 0, 0, 0] (from binaryNum) = binaryNum2

binaryNum     : [0, 1, 0, 0, 0, 1] of num = 17
binaryNum2    : [1, 0, 1, 1, 1, 1] of num2 = -17
minusBinaryNum: [1, 0, 1, 1, 1, 1] (from binaryNum) = binaryNum2

binaryNum     : [0, 1, 1, 1, 1, 1] of num = 31
binaryNum2    : [1, 0, 0, 0, 0, 1] of num2 = -31
minusBinaryNum: [1, 0, 0, 0, 0, 1] (from binaryNum) = binaryNum2

binaryNum     : [1, 1, 0, 0, 1, 1] of num = -13
binaryNum2    : [0, 0, 1, 1, 0, 1] of num2 = 13
minusBinaryNum: [0, 0, 1, 1, 0, 1] (from binaryNum) = binaryNum2

binaryNum     : [1, 0, 1, 1, 0, 1] of num = -19
binaryNum2    : [0, 1, 0, 0, 1, 1] of num2 = 19
minusBinaryNum: [0, 1, 0, 0, 1, 1] (from binaryNum) = binaryNum2

*/