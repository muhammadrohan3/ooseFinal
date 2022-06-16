package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    static ArrayList<User> userList = new ArrayList<>();
    Scanner input = new Scanner(System.in);


    public void getUsers(String type)
    {
        System.out.println("\t\t\t\t\t-------------------------------------------------");
        System.out.println("\t\t\t\t\t|  User Type    Username        Password\t|");
        System.out.println("\t\t\t\t\t-------------------------------------------------");
        for(User user : this.userList)
        {
            if(user.type.equals(type))
            {
                System.out.printf("\t\t\t\t\t|%10s  %10s  %15s\t|\n",user.type , user.userName,user.password);
                System.out.println("\t\t\t\t\t-------------------------------------------------");
            }
        }

    }

    public void addUser(String type, String userName, String password)
    {
        User newUser = new User(type , userName , password);
        this.userList.add(newUser);
    }

    public void addUser()
    {

        System.out.printf("\n\t\t\t\t\t\t\tEnter user type : ");
        String type = input.nextLine();
        System.out.printf("\n\t\t\t\t\t\t\tEnter User Name : ");
        String userName = input.nextLine();
        System.out.printf("\n\t\t\t\t\t\t\tEnter Password for the user : ");
        String password = input.nextLine();
        User newUser = new User(type , userName , password);
        this.userList.add(newUser);
        System.out.println("\t\t\t\t\t\t\t---------User added successfully--------");
    }


    

}
