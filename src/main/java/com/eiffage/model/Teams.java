package com.eiffage.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor  
public class Teams {
	@Id
	private Long id;
	private String name;
	private Long idChefChantier;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name="TEAMS_USERS")
	private List<Users> users;

	public Teams(Long id, String name, Long idChefChantier, List<Users> user) {
		super();
		this.id = id;
		this.name = name;
		this.idChefChantier = idChefChantier;
		if(this.users == null) {
			this.users = new ArrayList<Users>();
		}
		this.users.addAll(user);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getIdChefChantier() {
		return idChefChantier;
	}

	public void setIdChefChantier(Long idChefChantier) {
		this.idChefChantier = idChefChantier;
	}

	public List<Users> getUser() {
		return users;
	}

	public void setUser(List<Users> user) {
		this.users = user;
	}

	public Teams() {
		super();
	}

	@Override
	public String toString() {
		return "Teams [id=" + id + ", name=" + name + ", idChefChantier=" + idChefChantier 
				+ ", user=" + users + "]";
	}
	
	
}
