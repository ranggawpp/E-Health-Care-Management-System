package controllers;

import play.*;
import play.mvc.*;

@Check("admin")
@With(Secure.class)
public class Departments extends CRUD{
    
}
