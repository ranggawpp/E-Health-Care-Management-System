import java.util.Vector;

public class Doctor extends User {
	public int _doctorId;
	public int _departementId;
	public Department _department;
	public Vector<Medical_Report> _medical_Reports = new Vector<Medical_Report>();
	public Vector<Patient> _patients = new Vector<Patient>();
	public Vector<Prescription> _prescriptions = new Vector<Prescription>();

	public void getAppointments() {
		throw new UnsupportedOperationException();
	}

	public void getPatients() {
		throw new UnsupportedOperationException();
	}

	public void addPrescription() {
		throw new UnsupportedOperationException();
	}

	public void editMedicalReport() {
		throw new UnsupportedOperationException();
	}
}