 package com.eiffage.repo;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.eiffage.model.Tasks;


public interface TasksRepository extends JpaRepository<Tasks, Long> {
	public Tasks findByTitle(String Title);
	public Tasks findByMessage(String Message);
	public Tasks findByReporter(String Reporter);
	

	public List<Tasks> findByProject(Long id);

}
