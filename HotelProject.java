//Troy Zelden
//896677415
//Section: 1
//Submission Time: 7:00
package hotelproject;

import java.util.ArrayList;
import java.util.Collections;

public class HotelProject {


    public static void main(String[] args) {
        ArrayList<Hotel> hotels = new ArrayList<>();         
        
        Hotel h1 = new Hotel("Hilton", 5);
        h1.setRoomPrice(223);
        h1.setGoogleRating(4.1);
        
        Hotel h2 = new Hotel("Marriott", 4);
        h2.setRoomPrice(223);
        h2.setGoogleRating(4.5);
        
        Hotel h3 = new Hotel("Cook", 3);
        h3.setRoomPrice(116);
        h3.setGoogleRating(3.1);
        
        Hotel h4 = new Hotel("Wyndham", 3);
        h4.setRoomPrice(176);
        h4.setGoogleRating(5);
        
        Hotel h5 = new Hotel("Hyatt", 3);
        h5.setRoomPrice(176);
        h5.setGoogleRating(4.9);
        
        hotels.add(h1);
        hotels.add(h2);
        hotels.add(h3);
        hotels.add(h4);
        hotels.add(h5);
        
        Collections.sort(hotels);
        
        System.out.printf("%-10s%10s%10s%10s\n", "Hotel", "Stars", "Price", "Rating");
        System.out.println("------------------------------------------");
        
        for(Hotel h: hotels)
            System.out.println(h.printInfo());
        
        System.out.println("------------------------------------------");
    }
    
}
