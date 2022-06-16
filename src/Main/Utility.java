package Main;

import java.io.IOException;

public class Utility {
    public static void clear()
    {
        System.out.println("\t\t\t\t\t\t\tPress enter to continue...");
        try{System.in.read();}
        catch(Exception e){}
        try {

            if (System.getProperty("os.name").contains("Windows"))

                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            else

                Runtime.getRuntime().exec("clear");

        } catch (IOException | InterruptedException ex) {}
    }

}
