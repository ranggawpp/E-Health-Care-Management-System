package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
import java.time.*;


@Entity
public class Appointment extends Model{
	private int _appointmentId;
	private int _patientId;
	private int _doctorId;
	private LocalDate _appointmentDate;
	private LocalTime _appointmentTime;
	private int _departementId;
	public Patient _patient;
}