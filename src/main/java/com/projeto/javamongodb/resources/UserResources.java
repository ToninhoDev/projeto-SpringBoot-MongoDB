package com.projeto.javamongodb.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.javamongodb.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity< List<User>> findAll(){
		
		User maria = new User("1", "Maria", "Maria@hotmail.com");
		
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria));
		return ResponseEntity.ok().body(list);
	}

}