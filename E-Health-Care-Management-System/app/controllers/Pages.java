package controllers;
 
import play.*;
import play.mvc.*;
 
import java.util.*;
 
import models.*;
 
@With(Secure.class)
public class Pages extends Controller {
    
    @Before
    static void setConnectedUser() {
        if(Security.isConnected()) {
            User user = User.find("username", Security.connected()).first();
            renderArgs.put("user", user.fullName);
        }
    }

    public static void login() {
        render();
    }
    
    public static void index() {
        render();
    }

    public static void admin() {
        render();
    }

    public static void doctor() {
        render();
    }

    public static void patient() {
        render();
    }
    
    
}