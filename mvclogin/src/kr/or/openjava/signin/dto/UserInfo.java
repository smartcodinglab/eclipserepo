package kr.or.openjava.signin.dto;

public class UserInfo {
	
	private String userName;
	private String address;
	private String id;
	private String pw;
	
	public UserInfo(String userName, String address, String id, String pw) {
		this.userName = userName;
		this.address = address;
		this.id = id;
		this.pw = pw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
}
