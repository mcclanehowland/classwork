public class Split {
	String email;
	public Split(String email) {
		this.email = email;
	}
	public String getName() {
		return email.substring(0,email.indexOf('@'));
	}
	public String getDomain() {
		return email.substring(email.indexOf('@')+1,email.length());
	}
	public String getLastNameMVLA(String MVLA) {
		return MVLA.substring(MVLA.indexOf('.')+1,MVLA.indexOf('@'));
	}
	public String toString() {
		return "address " + email;
	}
}