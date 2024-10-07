package com.jwt.example.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.example.models.User;

@Service
public class UserService {
	private List<User> store = new ArrayList<>();
	
	public UserService() {
		store.add(new User(UUID.randomUUID().toString(),"Shivam jha", "Shivam@123"));
		store.add(new User(UUID.randomUUID().toString(),"Murari jha,", "murari@123"));
		store.add(new User(UUID.randomUUID().toString(),"Roshan jha,", "roshan@123"));
		store.add(new User(UUID.randomUUID().toString(),"Robin jha,", "robin@123"));
	}
	
	public List<User> getUsers(){
		return this.store;
	}
}
