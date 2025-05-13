package service;

import java.util.Scanner;

public class UserRegistration {

    public static boolean isUsernameValid(String username) {
        // TODO: implement validation logic
        if (username.length()>=5 & username.length()<=15)
            return true;
        else
            return false;
    }

    public static boolean isPasswordValid(String password) {
        // TODO: implement validation logic
        if (password.length()>=8)
            return true;
        else
            return false;
    }

    public static boolean register(String username, String password) {
        // TODO: implement registration logic using UserDatabase
        if (service.UserDatabase.userMap.put(username, password)) {
            //! HOW TO CHECK IF IT WORKS
        }
        else
            return false;
    }

    public static void main(String[] args) {
        // TODO: prompt for username and password, then call register()

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = myObj.nextLine();

        System.out.println("Enter username");
        String password = myObj.nextLine();

        register(userName, password);
    }
}
