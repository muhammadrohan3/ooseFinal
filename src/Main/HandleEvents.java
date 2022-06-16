package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HandleEvents {
    static ArrayList<Event> eventList = new ArrayList<>();
    List<String> data = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    List<String> services = new ArrayList<>();
    public void addEvent(String name)
    {
        Vendor vendor = new Vendor();

        System.out.println("\n\n\t\t\t---------------------------------------------------------------------------------");
        System.out.println("\t\t\t|     Name"+"                      "+"Details"+"               "+"Capacity"+"      "+"Address\t|");
        System.out.println("\t\t\t---------------------------------------------------------------------------------");
        int price = 0;

        for(Venue venue : vendor.venueList)
        {
            for(Availability available : venue.available ){
                if(available.available) {

                    data.add(available.date);
                }
            }
            System.out.printf("\t\t\t|%20s   %25s   %7d     %10s\t|\n",venue.venue,venue.venueDetails,venue.capacity,venue.address);
            System.out.println("\t\t\t---------------------------------------------------------------------------------");
        }

        System.out.printf("\t\t\t\t\t\t\tPlease select a venue : ");
        String venue = input.nextLine();
        int no = 1 ;
        for(Venue venue1 : vendor.venueList)
        {
            if(venue.equals(venue1.venue))
            {
                System.out.println("\n\n\t\t\t\t\t\t\tSelect from Available dates\n\n");
                for(Availability available : venue1.available)
                {
                    if(available.available)
                    {
                        System.out.println("\t\t\t\t\t\t\t\t"+no+"- "+available.date);
                        no++;
                    }
                }
                System.out.printf("\n\t\t\t\t\t\t\tEnter the date : ");
                String date = input.nextLine();
                for(Availability available : venue1.available)
                {
                    if(available.date.equals(date))
                    {
                        available.available = false;
                        price+=venue1.price;
                    }
                }
            }
        }
        System.out.println("\t\t\t-----------------------------------------------------------------------------------------");
        System.out.println("\t\t\t|  Id"+"        "+"Name"+"                           "+"Details"+"                        "+"Type"+"   "+"Price\t|");
        System.out.println("\t\t\t-----------------------------------------------------------------------------------------");
        for(Service service : vendor.serviceList)
        {
            System.out.printf("\t\t\t|%6s %15s   %40s   %10s   %5d\t|\n",service.serviceId,service.serviceTitle,service.serviceDescription,service.type,service.price);
            System.out.println("\t\t\t-----------------------------------------------------------------------------------------");
        }

        System.out.printf("\t\t\t\t\t\t\tChoose a service : ");
        String serviceId = input.nextLine();
        for(Service service : vendor.serviceList)
        {
            if(service.serviceId.equals(serviceId))
            {
                price+=service.price;
                services.add(service.serviceTitle);
            }
        }
        System.out.println("\t\t\t\t\t\t\tTotal price of the event : "+price);
        Event event = new Event("Event"+(eventList.size()+1) , name , venue , services.toArray(new String[services.size()]),price );
        eventList.add(event);
        System.out.println("\t\t\t\t\t\t\tEvent booked successfully");
    }
    public void getEvents()
    {
        System.out.println("\t\t\t---------------------------------------------------------------------------------");
        System.out.println("\t\t\t|   Event Id      Service          Venue          Price      Customer Name\t|");
        System.out.println("\t\t\t---------------------------------------------------------------------------------");
        for(Event event : eventList)
        {
            System.out.printf("\t\t\t|%10s  %15s  %15s %10d %15s\t|\n",event.eventID,event.services[0],event.venue,event.price ,event.customerName);
            System.out.println("\t\t\t---------------------------------------------------------------------------------");
        }

    }
    public void getEvents(String name) {
        System.out.println("\t\t\t--------------------------------------------------------------------------------");
        System.out.println("\t\t\t|   Event Id      Service          Venue          Price      Customer Name\t|");
        System.out.println("\t\t\t--------------------------------------------------------------------------------");
        for (Event event : eventList) {
            if (event.customerName.equals(name)) {
                System.out.printf("\t\t\t|%10s  %15s  %15s %10d %15s\t|\n", event.eventID, event.services[0], event.venue, event.price, event.customerName);
                System.out.println("\t\t\t---------------------------------------------------------------------------------");

            }

        }


    }
}
