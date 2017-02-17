package fr.univbrest.dosi.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.User;
import fr.univbrest.dosi.exceptions.SPIException;
import fr.univbrest.dosi.service.UserService;

@RestController
public class UserController {
    
	@Autowired 
	UserService userService;
	
	@RequestMapping(value="/auth",method = RequestMethod.POST, headers = "Accept=application/js")
	public void authentifier(final HttpServletRequest request, @RequestBody final User user){
		final User users = userService.authentifier(user.getUsername(), user.getPwd());
		
		if (users != null ){
			request.getSession().setAttribute("user", users);
		}else {
			request.getSession().removeAttribute("user");
			throw new SPIException("Impossible de s'authentifier");
		}
	}
	
	@RequestMapping(value = "/user")
	public User users(final HttpServletRequest request, final HttpServletResponse reponse){
		final User user = (User) request.getSession().getAttribute("user");
		return user;
	}
	
	@RequestMapping(value = "/deconnexion", method= RequestMethod.GET)
	public void authentifier(final HttpServletRequest request){
		request.getSession().removeAttribute("user");
	}
	
}
