package admin.login;

import java.io.Serializable;

public class signup_user implements Serializable {

	private static final long serialVersionUID = 1L;
	private String userid;
	private String password;
	private String fname;
	private String lname;
	private String emailid;
	private String contactno;
	

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
}