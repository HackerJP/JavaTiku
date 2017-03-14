package tiku.domain;
import java.io.Serializable;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String userid = "";
	private String username = "";
	private String password = "";
	private String info = "";
	
	public User() {}
	
	public User(String userid, String username, String password, String info) {
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.info = info;		
	}
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	public String getId() {
		return userid;
	}
	public void setId(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
}
