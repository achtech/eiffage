package com.eiffage.model;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
public class Tasks {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String title;
	private String description;
	private Users assignTo;
	private Status status;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name="TASKS_PROJECT")
	private List<Projects> project;
	public Tasks(Long id, String title, String description, Users assignTo, Status status, List<Projects> project) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.assignTo = assignTo;
		this.status = status;
		if(this.project == null) {
			this.project = new ArrayList<Projects>();
		}
		this.project.addAll(project);
		
	}
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Users getAssignTo() {
		return assignTo;
	}


	public void setAssignTo(Users assignTo) {
		this.assignTo = assignTo;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	public List<Projects> getProject() {
		return project;
	}


	public void setProject(List<Projects> project) {
		this.project = project;
	}


	public Tasks() {
		super();
		
	}




	@Override
	public String toString() {
		return "Tasks [id=" + id + ", title=" + title + ", description=" + description + ", users=" 
				+  ", status=" + status + ", project=" + project + "]";
	}
	
	
}
