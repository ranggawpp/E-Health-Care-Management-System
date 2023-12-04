package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;


@Entity
public class User extends Model{
	public String _username;
	public String _password;
	private int _userId;
	public String _name;
	public String _gender;
	public String _dOB;
	public String _address;
	public int _phone;

	public void Login() {
		throw new UnsupportedOperationException();
	}

	public void Logout() {
		throw new UnsupportedOperationException();
	}

	public void ChangePassword() {
		throw new UnsupportedOperationException();
	}

	public void ChangeInformation() {
		throw new UnsupportedOperationException();
	}
}