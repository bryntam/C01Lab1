package service;

import java.util.Scanner;

public class UserRegistration {

    public static boolean isUsernameValid(String username) {
        // TODO: implement validation logic
        if (username.length()>=5 && username.length()<=15)
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
        if (!isUsernameValid(username) || !isPasswordValid(password)) {
            return false;
        }
        // Check if username already exists
        if (UserDatabase.userMap.containsKey(username)) {
            return false;
        }
        
        // Register the user
        UserDatabase.userMap.put(username, password);
        return true;
    }

    public static void main(String[] args) {
        // TODO: prompt for username and password, then call register()

        Scanner s = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = s.nextLine();

        System.out.println("Enter username");
        String password = s.nextLine();

        register(userName, password);

        s.close();
    }
}
