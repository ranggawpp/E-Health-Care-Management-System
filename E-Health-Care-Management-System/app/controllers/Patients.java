package controllers;

import play.*;
import play.mvc.*;

@Check("admin OR patient")
@With(Secure.class)
public class Patients extends CRUD{
    
}
