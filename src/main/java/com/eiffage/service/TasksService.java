package com.eiffage.service;

import java.util.List;
import com.eiffage.model.Tasks;


public interface TasksService {
	List<Tasks> list();
	Tasks create(Tasks task);
	Tasks update(Tasks task);
	Tasks get(Long id); 

	
}
