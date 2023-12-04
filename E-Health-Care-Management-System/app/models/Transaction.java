package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
import java.time.*;


@Entity
public class Transaction extends Model{
	private int _transactionId;
	private int _patientId;
	private int _appointmentId;
	private LocalDate _paymentDate;
	private float _paymentAmount;
	public Patient _patient;
}