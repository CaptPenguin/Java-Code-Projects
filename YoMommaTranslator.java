//Troy Zelden
//CSC: 1351
package yomommatranslator;

import java.util.TreeMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class YoMommaTranslator {

    public static void main(String[] args) throws FileNotFoundException{
        TreeMap<String, String> words = new TreeMap<>();
        File input = new File("acronyms.txt");
        Scanner In = new Scanner(input);
        
        while(In.hasNextLine()){
            String line = In.nextLine();
            String[] split = line.split("\\t");
            words.put(split[0].toLowerCase(), split[1].toLowerCase());
        }
        
        System.out.println("Type out a sentence: ");
        Scanner in = new Scanner(System.in).useDelimiter("\\n");
        String userInput = in.next();
        String[] split = userInput.split("\\s+");
        
        String sentence = "";
        for(int i = 0; i < split.length; i++){
            if(words.containsKey(split[i].toLowerCase())){
                sentence += words.get(split[i].toLowerCase()) + " ";
            }    
            else
                sentence += split[i] + " ";
        }
        
        System.out.println(sentence);
            
    }
    
}
