package com.eiffage.service;

import java.util.List;

import com.eiffage.model.Projects;


public interface ProjectsService {
	List<Projects> list();
	Projects create(Projects project);
	Projects update(Projects project);
	Projects get(Long id); 

	
}
