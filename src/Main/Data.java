package Main;

public class Data {
    Data()
    {
        Admin handle = new Admin();


        handle.addUser("admin", "admin", "admin123");
        handle.addUser("admin", "admin1", "admin123");
        handle.addUser("admin", "admin2", "admin123");

        handle.addUser("customer", "customer", "customer123");
        handle.addUser("customer", "customer2", "customer123");
        handle.addUser("customer", "customer3", "customer123");


        handle.addUser("vendor", "vendor", "vendor123");
        handle.addUser("vendor", "vendor2", "vendor123");
        handle.addUser("vendor", "vendor3", "vendor123");

        Service service = new Service("id_1", "Marriage Menu", "Suitable for Barat and walima", 20000, "food");
        Service service2 = new Service("id_2", "Mehndi Menu", "Suitable for Mehndi and dholak", 12000, "food");
        Service service3 = new Service("id_3", "Birthday Menu", "Best for birthday parties", 15000, "food");

        Vendor.serviceList.add(service);
        Vendor.serviceList.add(service2);
        Vendor.serviceList.add(service3);

        Venue venue = new Venue("Garrison Golf Club", "Lahore", "Modern and Marque type", 230, new String[]{"12-01-22", "12-11-22", "12-10-22"},2000);
        Venue venue2 = new Venue("Qasr e Shahi", "Gujranwala", "Classic and Hall type", 300, new String[]{"13-04-22", "12-11-22", "12-09-22"},2000);
        Venue venue3 = new Venue("Marina Palace", "Islamabad", "Royal and Marque type", 500,new String[]{"12-05-22", "12-11-22", "12-12-22"},2000);

        Vendor.venueList.add(venue);
        Vendor.venueList.add(venue2);
        Vendor.venueList.add(venue3);

        HandleEvents.eventList.add(new Event("Event1","customer","Garrison Golf Club",new String[]{"birthday menu"},17000));

    }

}
