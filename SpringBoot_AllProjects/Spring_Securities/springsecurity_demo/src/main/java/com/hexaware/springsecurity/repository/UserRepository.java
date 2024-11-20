package com.hexaware.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.springsecurity.entity.UserEntity;

public interface UserRepository  extends JpaRepository<UserEntity,Long> {
	
	
				public  UserEntity    findByUserName(String username);

}
