package controllers;
 
import models.*;
 
public class Security extends Secure.Security {
	
    static boolean authenticate(String username, String password) {
        boolean auth = false;
        if (User.connect(username, password) != null){
            auth = true;
        }
        return auth;
    }

    static boolean check(String profile) {
        // Get the current user
        User user = User.find("username", connected()).<User>first();
    
        // Check if the user has the required profile
        switch (profile) {
            case "admin":
                return user.userType == UserType.ADMIN;
            case "patient":
                return user.userType == UserType.PATIENT;
            case "doctor":
                return user.userType == UserType.DOCTOR;
            default:
                return false;
        }
    }
        
    static void onDisconnected() {
        Application.index();
    }

    static void onAuthenticated() {
        Pages.index();
    }
}