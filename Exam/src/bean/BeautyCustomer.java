package  bean;

import java.io.Serializable;

public class BeautyCustomer  implements  Serializable {
	private int id;
	private String login;
	private String password;
	
	public BeautyCustomer()  {}
	
	public BeautyCustomer(String login, String password) {
		this.login = login;
		this.password = password;
	}
	public int getId() { return id; }
	pubic void setId(int id) { this.id = id; }
	
	public String getlogin() { return login; }
	public void setLogin(String login) { this.login = login; }
	
	public String getPassword() { return password; }
	public void setPassword(String Password) {this.password = password; }
}