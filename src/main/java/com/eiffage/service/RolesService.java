package com.eiffage.service;

import java.util.List;
import com.eiffage.model.Roles;
import com.eiffage.model.Users;

public interface RolesService {
	List<Roles> list();
	List<Users> getUsersByRole(String role);
	
}
