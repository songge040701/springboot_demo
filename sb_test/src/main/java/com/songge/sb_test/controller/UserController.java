package com.songge.sb_test.controller;

import java.text.DateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.songge.sb_test.config.SbProperties;
import com.songge.sb_test.domain.User;
import com.songge.sb_test.domain.UserRepository;
import com.songge.sb_test.form.UserForm;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private SbProperties sbproperties;

	@RequestMapping(value="/addUser/{username}/{password}/{email}/{nickname}", method=RequestMethod.GET)
	public User addUser(@PathVariable String username,
			@PathVariable String password,
			@PathVariable String email,
			@PathVariable String nickname) {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);        
		String formattedDate = dateFormat.format(date);
		
		User user = userRepository.save(new User(username, email, nickname, password, formattedDate));
		return user;
	}
	

	@RequestMapping(value="/addUser", method=RequestMethod.POST)
	public User addUserPost(@ModelAttribute("form") UserForm form) {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);        
		String formattedDate = dateFormat.format(date);
		
		User user = userRepository.save(new User(form.getUserName(), sbproperties.getTitle(), sbproperties.getComment(), "123", formattedDate));
		return user;
	}
}
