package controllers;

import play.*;
import play.mvc.*;

@Check("admin OR doctor")
@With(Secure.class)
public class Doctors extends CRUD{
    
}
