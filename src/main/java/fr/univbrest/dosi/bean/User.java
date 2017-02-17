package fr.univbrest.dosi.bean;

public class User {
      private String Username;
      private String Pwd ;
      
	public User(final String username,final String pwd) {
		super();
		Username = username;
		Pwd = pwd;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPwd() {
		return Pwd;
	}

	public void setPwd(String pwd) {
		Pwd = pwd;
	}
      

      
      
      
}
