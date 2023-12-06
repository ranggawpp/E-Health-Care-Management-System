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
            case "all":
                return true;
            case "admin OR doctor":
                return user.userType == UserType.ADMIN || user.userType == UserType.DOCTOR;
            case "admin OR patient":
                return user.userType == UserType.ADMIN || user.userType == UserType.PATIENT;
            default:
                return false;
        }
    }
        
    static void onDisconnected() {
        Application.index();
    }

    static void onAuthenticated() {
        User user = User.find("username", connected()).<User>first();
        switch (user.userType) {
            case ADMIN:
                Pages.admin();
                break;
            case DOCTOR:
                Pages.doctor();
                break;
            case PATIENT:
                Pages.patient();
                break;
            default:
                Pages.index();
                break;
        }
    }
}