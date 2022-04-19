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
	public class Comments {
		@Id
		private Long id; 
		private String message;
		private String reporter;
		protected LocalDateTime timeStamp;
		
		@ManyToMany(fetch = FetchType.EAGER)
		@JoinTable(name="COMMENTS_TASKS")
		private List<Tasks> tasks;


		public Comments(Long id, String message, String reporter, LocalDateTime timeStamp, List<Tasks> tasks) {
			super();
			this.id = id;
			this.message = message;
			this.reporter = reporter;
			this.timeStamp = timeStamp;
			if(this.tasks == null) {
				this.tasks = new ArrayList<Tasks>();
			}
			this.tasks.addAll(tasks);
		}




		public Comments() {
			super();
			
		}
		




		public Long getId() {
			return id;
		}




		public void setId(Long id) {
			this.id = id;
		}




		public String getMessage() {
			return message;
		}




		public void setMessage(String message) {
			this.message = message;
		}




		public String getReporter() {
			return reporter;
		}




		public void setReporter(String reporter) {
			this.reporter = reporter;
		}




		public LocalDateTime getTimeStamp() {
			return timeStamp;
		}




		public void setTimeStamp(LocalDateTime timeStamp) {
			this.timeStamp = timeStamp;
		}




		public List<Tasks> getTasks() {
			return tasks;
		}




		public void setTasks(List<Tasks> tasks) {
			this.tasks = tasks;
		}




		@Override
		public String toString() {
			return "Comments [id=" + id + ", Message=" + message + ", Reporter=" + reporter + ", TimeStamp=" +timeStamp
					+  ",Tasks=" + tasks + "]";
		}
		
	}
