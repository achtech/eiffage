package com.eiffage.service.implementation;
 import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eiffage.model.Users;
import com.eiffage.repo.UsersRepository;
import com.eiffage.service.UsersService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class UsersServiceImpl implements UsersService{

	@Autowired
	UsersRepository usersRepo;

	@Override
	public List<Users> list() {
		return usersRepo.findAll();
	}

	@Override
	public Users create(Users user) {
		return usersRepo.save(user);
	}

	@Override
	public Users update(Users user) {
		return usersRepo.save(null);
	}

	@Override
	public Users get(Long id) {
		return usersRepo.findById(id).get();
	}

}
