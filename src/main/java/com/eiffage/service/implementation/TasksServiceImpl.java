package com.eiffage.service.implementation;
 import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eiffage.model.Tasks;
import com.eiffage.repo.TasksRepository;
import com.eiffage.service.TasksService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class TasksServiceImpl implements TasksService{

	@Autowired
	TasksRepository tasksRepo;

	@Override
	public List<Tasks> list() {
		return tasksRepo.findAll();
	}

	@Override
	public Tasks create(Tasks task) {
		return tasksRepo.save(task);
	}

	@Override
	public Tasks update(Tasks task) {
		return tasksRepo.save(null);
	}

	@Override
	public Tasks  get(Long id) {
		return tasksRepo.findById(id).get();
	}

}
