package com.capgemini.cab.management.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.cab.management.application.domain.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long>{
	
	Login findByUsernameAndPassword(String username, String password);
 
}
