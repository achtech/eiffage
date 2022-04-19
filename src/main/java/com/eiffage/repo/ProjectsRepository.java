 package com.eiffage.repo;



import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eiffage.model.Projects;


public interface ProjectsRepository extends JpaRepository<Projects, Long> {
	public Projects findByLibelle(String libelle);
	public Projects findByDescription(String description);
	public Projects findByTimestamp(LocalDateTime timestamp);
	

	public List<Projects> findByTeams(Long id);

}
