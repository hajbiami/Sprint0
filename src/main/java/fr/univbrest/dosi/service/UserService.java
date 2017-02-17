package fr.univbrest.dosi.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.User;


@Service
public class UserService {

	private final Map<String, User> mapBouchonUser;
	
	public UserService(){
		this.mapBouchonUser = new HashMap<String , User>();
		this.mapBouchonUser.put("spiAdmin", new User("spiAdmin", "spiAdmin"));
	}
	
	
	public User authentifier(final String login, final String pwd){
		final User user = this.mapBouchonUser.get(login);
		if(user != null && user.getPwd().equals(pwd)){
			return user;
		}
		return null;
	}
}
