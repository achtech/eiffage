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
	public class Files {
		@Id
		private Long id; 
		private String title;
		private String path;
		private String icon;
		
		@ManyToMany(fetch = FetchType.EAGER)
		@JoinTable(name="FILES_TASKS")
		private List<Tasks> tasks;

		
	

		public Files(Long id, String title, String path, String icon, List<Tasks> tasks) {
			super();
			this.id = id;
			this.title = title;
			this.path = path;
			this.icon = icon;
			if(this.tasks == null) {
				this.tasks = new ArrayList<Tasks>();
			}
			this.tasks.addAll(tasks);
		}



		public Files() {
			super();
			
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



		public String getPath() {
			return path;
		}



		public void setPath(String path) {
			this.path = path;
		}



		public String getIcon() {
			return icon;
		}



		public void setIcon(String icon) {
			this.icon = icon;
		}



		public List<Tasks> getTasks() {
			return tasks;
		}



		public void setTasks(List<Tasks> tasks) {
			this.tasks = tasks;
		}



		@Override
		public String toString() {
			return "Files [id=" + id + ", Title=" + title + ", Path=" + path + ", Icon=" +icon
					+  ",Tasks=" + tasks + "]";
		}
		
	}
