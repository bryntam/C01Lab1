package service;

import java.util.Scanner;

public class UserLogin {

    public static boolean login(String username, String password) {
        // TODO: implement login logic using UserDatabase

        //You are a signed up user
        if (UserDatabase.userMap.containsKey(username)) {
            String checkpassword = UserDatabase.userMap.get(username);
            if (checkpassword.equals(password)) {
                return true;
            }
            else 
                return false;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        // TODO: prompt for username and password, then call login()
        Scanner s = new Scanner(System.in);  
        System.out.println("Enter username");
        String inputusername = s.nextLine();

        System.out.println("Enter password");
        String inputpassword = s.nextLine();

        s.close();

        login(inputusername, inputpassword);
    }
}
