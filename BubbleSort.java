//---Troy Zelden---
//CSC-1350, Kundu
package bubblesort;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSort
{ int[] nums = {};
  public static void main(String[] args)
  { System.out.print("Enter number of random items to sort (>= 1 and < 10): ");
    Scanner scan = new Scanner(System.in);
    int numItems = scan.nextInt();
    testBubbleSort(2, numItems);
  }
  public BubbleSort(int numItems, int maxItemValue, int randomSeed)
  { nums = new int[numItems];
    Random rand = new Random(Math.round(randomSeed));
    for (int i = 0; i < numItems; i++)
        nums[i] = rand.nextInt(maxItemValue + 1);
    System.out.println("\nConstructor: nums = " + Arrays.toString(nums) + 
                       " (using random-seed = " + randomSeed + ")");
  }
  public void bubbleSort()
  { int numComparisonsInPass = nums.length - 1, numExchanges;
    do
    { String exchangesInThisPass = "";
      numExchanges = 0;
      for (int i = 1; i <= numComparisonsInPass; i++)
      { if(nums[i - 1] > nums[i])
        { numExchanges++;
          exchangesInThisPass += "(" + nums[i - 1] + ", " + nums[i] + ")";
          int temp = nums[i];
          nums[i] = nums[i - 1];
          nums[i - 1] = temp;
        }  
      }
      System.out.println(numExchanges + " exchanges in Pass #" + (nums.length - numComparisonsInPass) + 
                                        ":" + exchangesInThisPass);
      System.out.println("nums: " + Arrays.toString(nums));
      numComparisonsInPass--;
    } while((numExchanges > 0) && (numComparisonsInPass > 0));
  }
  public static void testBubbleSort(int numTests, int numItems)
  { int min, maxItemValue;
    if(numItems <= (Integer.MAX_VALUE / 5))min = numItems;
    else min = Integer.MAX_VALUE / 5;
    maxItemValue = 5 * min - 1;
    System.out.println("\nShown below are sucessive phases " + 
                       "of the simple Bubble-sort for\n" + numTests +
                       " random arrays of size " + numItems + 
                       ", with items in the range [0, " + maxItemValue + "]");
    for(int i = 0; i < numTests; i++)
    { BubbleSort bs = new BubbleSort(numItems, maxItemValue, i);
      bs.bubbleSort();
    }    
  }
}
