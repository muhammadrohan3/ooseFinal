package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vendor {

    List<String> data = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    static ArrayList<Service> serviceList = new ArrayList<>();
    static ArrayList<Venue> venueList = new ArrayList<>();


    //to add service in the service list
    public void addService()
    {
        System.out.printf("\n\t\t\t\t\t\t\tPlease enter the service id : ");
        String serviceId = input.nextLine();
        System.out.printf("\n\t\t\t\t\t\t\tPlease enter the service title : ");
        String serviceTitle = input.nextLine();
        System.out.printf("\n\t\t\t\t\t\t\tPlease enter the service description : ");
        String serviceDescription = input.nextLine();
        System.out.printf("\n\t\t\t\t\t\t\tPlease enter the price of the service : ");
        int price = input.nextInt();
        System.out.printf("\n\t\t\t\t\t\t\tPlease enter the type of the service : ");
        String type = input.next();
        Service service = new Service(serviceId, serviceTitle, serviceDescription, price, type);
        serviceList.add(service);
        System.out.println("\n\t\t\t\t\t\t\t---------------Successfully Added------------ ");
    }

    public void addVenue()
    {
        System.out.println("\t\t\t\t\t\t\tPlease enter Venue details below");
        System.out.printf("\n\t\t\t\t\t\t\tEnter venue name : ");
        String venue = input.nextLine();
        System.out.printf("\n\t\t\t\t\t\t\tPlease enter your venue address : ");
        String address = input.nextLine();
        System.out.printf("\n\t\t\t\t\t\t\tPlease describe your venue : ");
        String venueDetails = input.nextLine();
        System.out.printf("\n\t\t\t\t\t\t\tPlease enter your venue capacity : ");
        int capacity = input.nextInt();
        System.out.printf("\n\t\t\t\t\t\t\tEnter booking price of the venue : ");
        int price = input.nextInt();
        int no = 0;
        int option = 0;

        //getting available dates from the user
        while(option == 0)
        {
            System.out.printf("\n\t\t\t\t\t\t\tPlease enter the date %d : ", no+1);
            String date1 = input.next();
            data.add(date1);

            no++;
            System.out.printf("\n\t\t\t\t\t\t\tDo you want to enter more dates ? \n\n");
            System.out.println("\t\t\t\t\t\t\t1- Press 0 to continue");
            System.out.println("\t\t\t\t\t\t\t2- Press 1 to save and exit");
            System.out.printf("\n\t\t\t\t\t\t\tEnter your option : ");
            option = input.nextInt();

        }


        //adding the new venue to the venue list
        venueList.add(new Venue(venue , address, venueDetails ,capacity , data.toArray(new String[data.size()]), price));
        getVenue();
        System.out.println("\n\t\t\t\t\t\t\t---------------Successfully Added------------ ");
    }
    public void getVenue()
    {
        System.out.println("\t\t\t---------------------------------------------------------------------------------");
        System.out.println("\t\t\t|     Name"+"                      "+"Details"+"               "+"Capacity"+"      "+"Address\t|");
        System.out.println("\t\t\t---------------------------------------------------------------------------------");
        for(Venue venue : venueList)
        {
            System.out.printf("\t\t\t|%20s   %25s   %7d     %10s\t|\n",venue.venue,venue.venueDetails,venue.capacity,venue.address);
            System.out.println("\t\t\t---------------------------------------------------------------------------------");
        }

    }

    public void getService()
    {
        System.out.println("\t\t\t------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t|  Id"+"        "+"Name"+"                           "+"Details"+"                        "+"Type"+"   "+"Price\t|");
        System.out.println("\t\t\t------------------------------------------------------------------------------------------");

        for(Service service : serviceList)
        {
            if(service.price!=0)
            {
                System.out.printf("\t\t\t|%6s %15s   %40s   %10s   %5d\t|\n",service.serviceId,service.serviceTitle,service.serviceDescription,service.type,service.price);
                System.out.println("\t\t\t------------------------------------------------------------------------------------------");
            }
        }


    }

    public void deleteService()
    {
        System.out.println("\t\t\t------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t|  Id"+"        "+"Name"+"                           "+"Details"+"                        "+"Type"+"   "+"Price\t|");
        System.out.println("\t\t\t------------------------------------------------------------------------------------------");
        for(Service service : serviceList)
        {
            if(service.price!=0)
            {
                System.out.printf("\t\t\t|%6s %15s   %40s   %10s   %5d\t|\n",service.serviceId,service.serviceTitle,service.serviceDescription,service.type,service.price);
                System.out.println("\t\t\t-------------------------------------------------------------------------------------------");
            }
        }
        System.out.print("\n\t\t\t\t\t\t\tSelect Service ID you want to delete : ");
        String option = input.nextLine();
        for(Service service : serviceList)
        {
            if(option.equals(service.serviceId))
            {
                service.serviceId="";
                service.serviceTitle="";
                service.serviceDescription="";
                service.type="";
                service.price=0;
            }
            
        }
        System.out.println("\n\t\t\t\t\t\t\t---------------Successfully deleted--------------- \n");
    }

    public void updateService()
    {
        System.out.println("\t\t\t------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t|  Id"+"        "+"Name"+"                           "+"Details"+"                        "+"Type"+"   "+"Price\t|");
        System.out.println("\t\t\t-----------------------------------------------------------------------------------------");
        for(Service service : serviceList)
        {
            if(service.price!=0)
            {
                System.out.printf("\t\t\t|%6s %15s   %40s   %10s   %5d\t|\n",service.serviceId,service.serviceTitle,service.serviceDescription,service.type,service.price);
                System.out.println("\t\t\t-----------------------------------------------------------------------------------------");
            }
        }

        System.out.print("\n\t\t\t\t\t\t\tSelect Service ID you want to UPDATE : ");
        String option = input.nextLine();
        for(Service service : serviceList)
        {
            if(option.equals(service.serviceId))
            {
        System.out.printf("\n\t\t\t\t\t\t\tPlease enter the service title : ");
        service.serviceTitle= input.nextLine();
        System.out.printf("\n\t\t\t\t\t\t\tPlease enter the service description : ");
        service.serviceDescription = input.nextLine();
        System.out.printf("\n\t\t\t\t\t\t\tPlease enter the price of the service : ");
        service.price = input.nextInt();
        System.out.printf("\n\t\t\t\t\t\t\tPlease enter the type of the service : ");
        service.type= input.next();
            }
            
        }
        System.out.println("\n\t\t\t\t\t\t\t---------------Successfully Updated------------ \n");
    }

}
