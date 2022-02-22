//Troy Zelden
//896677415
//Section: 1
package filesproject;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class FilesProject {

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter outFile = new PrintWriter("calculations.txt");
        Random rand = new Random();

        for(int i = 0; i < 1000; i++)
            outFile.printf("%d\n",rand.nextInt(1000 + 1));
            
        outFile.close();
        
        File inputFile = new File("calculations.txt");
        Scanner in = new Scanner(inputFile);
        
            System.out.printf("%.2f", calculateAverage());
        
        in.close();
    }
    
    public static double calculateAverage() throws FileNotFoundException{
        
         File inputFile = new File("calculations.txt");
         Scanner in = new Scanner(inputFile);
         
         double sum = 0;
         int count = 0;
         
         while(in.hasNextInt())
         {
             sum += in.nextInt();
             count++;
             
         }
         in.close();
         
         return sum/count;
    }
}
