package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;


@Entity
public class Prescription extends Model{
	//private id _prescriptionId;
	private String _patientName;
	private int _patientId;
	private String _prescriptionDetail;
	//public Doctors _doctor;
	public Patient _patient;
}