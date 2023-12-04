package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
import java.time.*;


@Entity
public class Medical_Report extends Model{
	private int _reportId;
	private String _reportDetail;
	private LocalDate _reportDate;
	private String _patientName;
	private int _patientId;
	private int _doctorId;
	public Patient _patient;
	//public Doctors _doctor;
}