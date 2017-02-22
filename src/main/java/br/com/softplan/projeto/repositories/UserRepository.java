package br.com.softplan.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.softplan.projeto.domain.User;


@Transactional
public interface UserRepository extends JpaRepository<User, Integer>{
	
	
	
	 User findByUsername(String username);
	
	 
	
}