 package com.eiffage.repo;



import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eiffage.model.Project;


public interface ProjectRepository extends JpaRepository<Project, Long> {
	public Project findByLibelle(String libelle);
	public Project findByDescription(String description);
	public Project findByTimestamp(LocalDateTime timestamp);
	

	public List<Project> findByTeams(Long id);

}
