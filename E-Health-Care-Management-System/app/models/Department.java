package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;


@Entity
public class Department extends Model{
	public int _departementId;
	public String _departementName;
	//public Doctors _doctor;
}