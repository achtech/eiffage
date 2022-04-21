package com.eiffage.service.implementation;
 import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eiffage.model.Files;
import com.eiffage.repo.FilesRepository;
import com.eiffage.service.FilesService;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class FilesServiceImpl implements FilesService{

	@Autowired
	FilesRepository filesRepo;

	@Override
	public List<Files> list() {
		return filesRepo.findAll();
	}

	@Override
	public Files create(Files file) {
		return filesRepo.save(file);
	}

	@Override
	public Files update(Files file) {
		return filesRepo.save(null);
	}

	@Override
	public Files get(Long id) {
		return filesRepo.findById(id).get();
	}

}
