 package com.eiffage.repo;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eiffage.model.Files;



public interface FilesRepository extends JpaRepository<Files, Long> {
	public Files findByTitle(String Title);
	public Files findByPath(String Path);
	

	public List<Files> findByTasks(Long id);

}
