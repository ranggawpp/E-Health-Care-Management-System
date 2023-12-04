package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;


import java.util.Vector;

@Entity
public class Patient extends User {
	public int _patientId;
	public int _doctorId;
	//public Doctors _doctor;
	public Vector<Prescription> _prescriptions = new Vector<Prescription>();
	public Vector<Medical_Report> _medical_Reports = new Vector<Medical_Report>();
	//public Vector<Transactions> _transactions = new Vector<Transactions>();
	public Vector<Appointment> _appointments = new Vector<Appointment>();

	public void getAppointments() {
		throw new UnsupportedOperationException();
	}

	public void viewMedicalReport() {
		throw new UnsupportedOperationException();
	}

	public void bookAppointment() {
		throw new UnsupportedOperationException();
	}

	public void cancelAppointment() {
		throw new UnsupportedOperationException();
	}

	public void makePayment() {
		throw new UnsupportedOperationException();
	}
}