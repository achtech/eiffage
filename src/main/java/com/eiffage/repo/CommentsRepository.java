 package com.eiffage.repo;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eiffage.model.Comments;



public interface CommentsRepository extends JpaRepository<Comments, Long> {
	public Comments findByMessage(String Message);
	public Comments findByReporter(String Reporter);
	

	public List<Comments> findByTasks(Long id);

}
