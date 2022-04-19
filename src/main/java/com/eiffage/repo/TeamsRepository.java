 package com.eiffage.repo;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eiffage.model.Teams;

public interface TeamsRepository extends JpaRepository<Teams, Long> {
	public Teams findByName(String name);
	public Teams findByIdChefChantier(Long idChefChantier);

	public List<Teams> findByUsers(Long id);

}
