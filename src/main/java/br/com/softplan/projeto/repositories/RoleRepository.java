package br.com.softplan.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import br.com.softplan.projeto.domain.Role;


@Transactional
public interface RoleRepository extends JpaRepository<Role, Long>{
	
	
	
	 
	
}