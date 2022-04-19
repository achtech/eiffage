package com.eiffage.model;

import java.time.LocalDateTime;
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
	public class Project {
		@Id
		private Long id; 
		private String description;
		private String title;
		protected LocalDateTime timeStamp;
		
		@ManyToMany(fetch = FetchType.EAGER)
		@JoinTable(name="PROJECT_TEAMS")
		private List<Teams> teams;

		public Project(Long id, String description, String title, LocalDateTime timeStamp, List<Teams> team) {
			super();
			this.id = id;
			this.description = description;
			this.title = title;
			this.timeStamp = timeStamp;
			if(this.teams == null) {
				this.teams = new ArrayList<Teams>();
			}
			this.teams.addAll(team);
		}

		public Project() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public LocalDateTime getTimeStamp() {
			return timeStamp;
		}

		public void setTimeStamp(LocalDateTime timeStamp) {
			this.timeStamp = timeStamp;
		}

		public List<Teams> getTeam() {
			return teams;
		}

		public void setTeam(List<Teams> team) {
			this.teams = team;
		}
		
		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		@Override
		public String toString() {
			return "Project [id=" + id + ", Title=" + title + ", Description=" + description + ", TimeStamp=" +timeStamp
					+  ",team=" + teams + "]";
		}
		
	}
