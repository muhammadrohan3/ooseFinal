package Main;

import java.util.ArrayList;

public class Service {
    String serviceId;
    String serviceTitle;
    String serviceDescription;
    int price;
    String type;
    Service(String serviceId, String serviceTitle, String serviceDescription, int price, String type)
    {
        this.serviceId = serviceId;
        this.serviceTitle = serviceTitle;
        this.serviceDescription = serviceDescription;
        this.price = price;
        this.type = type ;
    }
    Service()
    {

    }

    @Override
    public String toString() {
        return "Service{" +
                "serviceId='" + serviceId + '\'' +
                ", serviceTitle='" + serviceTitle + '\'' +
                ", serviceDescription='" + serviceDescription + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }
}
