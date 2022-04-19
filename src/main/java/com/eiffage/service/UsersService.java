package com.eiffage.service;

import java.util.List;
import com.eiffage.model.Users;

public interface UsersService {
	List<Users> list();
	Users create(Users user);
	Users update(Users user);
	Users get(Long id); 

	
}
