package com.eiffage.service;

import java.util.List;

import com.eiffage.model.Teams;

public interface TeamsService {
	List<Teams> list();
	Teams create(Teams team);
	Teams update(Teams team);
	Teams get(Long id); 

	
}
