package mvc;

public class user {
    private String email;
    private String uname;
    private String pass;
	@Override
	public String toString() {
		return "user [email=" + email + ", uname=" + uname + ", pass=" + pass + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
}
