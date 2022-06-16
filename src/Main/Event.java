package Main;

public class Event {
    String eventID;
    String customerName;
    String venue;
    String services[];
    int price;
    Event()
    {

    }
    Event(String eventId, String customerName, String venue, String[] services, int price)
    {
        this.eventID = eventId;
        this.customerName = customerName;
        this.venue = venue;
        this.price = price;
        this.services = services;
    }
}
