package com.eiffage.service;

import java.util.List;

import com.eiffage.model.Files;

public interface FilesService {
	List<Files> list();
	Files create(Files file);
	Files update(Files file);
	Files get(Long id); 
}
