package Main;

import java.util.ArrayList;

public class Venue {
    String venue;
    String address;
    String venueDetails;
    int capacity;
    int price;
    ArrayList<Availability> available = new ArrayList<>();

    Venue()
    {

    }
    Venue(String venue , String address, String venueDetails, int capacity , String[] date, int price)
    {
        this.venue = venue;
        this.address = address;
        this.venueDetails = venueDetails;
        this.capacity = capacity;
        this.price = price;

        for(String date1 : date)
        {
            Availability available2 = new Availability(date1);
            available.add(available2);
        }

    }
}
