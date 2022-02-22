/**
 * To create a military time clock from a 4 digit number. 
 * @author Troy Zelden
 * <pre>
 * Date:February 10th, 2021
 * Course:CSC1350 Section: 01
 * LAb: 3 <br>
 * Instructor: Dr. Duncan<br>
 * </pre>
 */
package clock24to12;
import java.util.Scanner;
public class Clock24To12 
{ 
    public static void main(String[] args) 
    {   
        Scanner scan = new Scanner(System.in); 
        System.out.print("Enter time in 24-hour clock [0000-2400] ->");
        int time = scan.nextInt();
        
        
        if(time <= 2400 || time >=0){
     
        int lastTwo = time%100;
        int firstTwo = time/100;
  
            if((firstTwo> 24 && lastTwo > 0) || lastTwo > 59 || firstTwo <0 || lastTwo<0){
                System.out.println(time+ " is not a valid time on the 24-hour clock.");
            }
        
            else{
                
        if (firstTwo <= 24 && firstTwo >12){
            firstTwo = firstTwo-12;
         
        }
        if(firstTwo == 0){
            firstTwo =12;
        }
        String day= "";
        if(firstTwo <= 12 && firstTwo >0){
            day = "AM";
        }
        if(firstTwo > 12 && firstTwo < 24){
           day = "PM";
        }
        System.out.printf("%d is equivalent to %2d:%2d%s",time,firstTwo,lastTwo, day);
        
        }
    }
    }
    
    
}
