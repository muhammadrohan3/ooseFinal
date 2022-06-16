package Main;
import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    public void loginMenu()
    {
        Utility.clear();
        System.out.println("\n\n\n\n\n\n\n\n\t\t\t\t---------------------Choose user type--------------------\n\n\n");
        System.out.println("\t\t\t\t\t\t\t1-Customer");
        System.out.println("\t\t\t\t\t\t\t2-Admin");
        System.out.println("\t\t\t\t\t\t\t3-Vendor");
    }


    public void customerMenu(String name)
    {
        Utility.clear();
        System.out.flush();
        System.out.println("\n\n\n\n\n\n\n\n\t\t\t\t---------------------Choose Option-------------------------\n\n");
        System.out.println("\t\t\t\t\t\t\t1-Book Event");
        System.out.println("\t\t\t\t\t\t\t2-Booked events");
        System.out.println("\t\t\t\t\t\t\t3-Logout");
        System.out.printf("\t\t\t\t\t\t\tEnter your choice here : ");
        int option = input.nextInt();
        HandleEvents event1 = new HandleEvents();
        if(option == 1)
        {
            event1.addEvent(name);
            customerMenu(name);
        }
        else if(option == 2)
        {
            event1.getEvents(name);
            customerMenu(name);
        }
        else if (option == 3)
        {
            
            new Login().login();
        }
    }
    public void vendorMenu()
    {
        Utility.clear();
        System.out.println("\n\n\n\n\n\n\n\n\t\t\t\t-------------------------Choose Option-----------------------------\n\n");
        System.out.println("\t\t\t\t\t\t\t1-Add service");
        System.out.println("\t\t\t\t\t\t\t2-Add venue");
        System.out.println("\t\t\t\t\t\t\t3-View Services");
        System.out.println("\t\t\t\t\t\t\t4-View Venue");
        System.out.println("\t\t\t\t\t\t\t5-Delete Service");
        System.out.println("\t\t\t\t\t\t\t6-Update Service");
        System.out.println("\t\t\t\t\t\t\t7-Log out");
        System.out.print("\t\t\t\t\t\t\t Enter your choice here : ");
        int option = input.nextInt();


        if(option == 1)
        {

            Vendor vendor = new Vendor();
            vendor.addService();
            vendorMenu();
        }
        else if(option == 2)
        {

            Vendor vendor = new Vendor();
            vendor.addVenue();
            vendorMenu();
        }
        if(option == 3)
        {

            Vendor vendor = new Vendor();
            vendor.getService();
            vendorMenu();
        }
        if(option == 4)
        {

            Vendor vendor = new Vendor();
            vendor.getVenue();
            vendorMenu();
        }
        if(option == 5)
        {

            Vendor vendor = new Vendor();
            vendor.deleteService();
            vendorMenu();
        }
        if(option == 6)
        {

            Vendor vendor = new Vendor();
            vendor.updateService();
            vendorMenu();
        }
        else if (option == 7)
        {
            new Login().login();
        }
    }
    
    public void adminMenu()
    {
        Utility.clear();
        System.out.println("\n\n\n\n\n\n\n\n\t\t\t\t--------------------Choose Option--------------------\n\n");
        System.out.println("\t\t\t\t\t\t\t1-View customers");
        System.out.println("\t\t\t\t\t\t\t2-View vendors");
        System.out.println("\t\t\t\t\t\t\t3-View Events");
        System.out.println("\t\t\t\t\t\t\t4-Add user");
        System.out.println("\t\t\t\t\t\t\t5-Logout");
        System.out.print("\t\t\t\t\t\t\tEnter your choice here : ");
        int option = input.nextInt();

        
        if(option == 1)
        {
            Admin user1 = new Admin();
            user1.getUsers("customer");
            adminMenu();
            
        }
        else if(option == 2)
        {
            Admin user1 = new Admin();
            user1.getUsers("vendor");
            adminMenu();
        }
        else if (option == 3)
        {
            HandleEvents handle = new HandleEvents();
            handle.getEvents();
            adminMenu();
        }
        else if (option == 4)
        {
            new Admin().addUser();
            adminMenu();
        }
        else if (option == 5)
        {
            new Login().login();
        }
    }

}
