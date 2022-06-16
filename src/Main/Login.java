package Main;


import java.util.Scanner;

public class Login {
    String type;
    String userName;
    String password;
    Scanner input = new Scanner(System.in);
    Menu menu = new Menu();
    public void login()
    {
        menu.loginMenu();
        System.out.printf("\n\t\t\t\t\t\t\tEnter user type : ");
        this.type = input.next();
        System.out.printf("\n\t\t\t\t\t\t\tEnter User Name : ");
        this.userName = input.next();
        System.out.printf("\n\t\t\t\t\t\t\tEnter password : ");
        this.password = input.next();


        boolean status = false;
        for(User user : new Admin().userList)
        {

            if((this.type.equals(user.type)) && (user.userName.equals(this.userName) && user.password.equals(this.password)))
            {
                status = true;
                System.out.println("\t\t\t\t\t\t\tLogged In successfully");
                if(this.type.equals("customer"))
                {
                    menu.customerMenu(userName);
                }
                else if(this.type.equals("admin"))
                {
                    menu.adminMenu();
                }
                else if(this.type.equals("vendor"))
                {
                    menu.vendorMenu();
                }
            }
        }
        if(!status)
        {
            System.out.println("\t\t\t\t\t\t\tPassword wrong, Click to continue");
            new Login().login();
        }
    }
}
