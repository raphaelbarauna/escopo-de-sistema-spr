package br.com.softplan.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.softplan.projeto.domain.Usuario;


@Transactional
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
	
	
	 public Usuario findByNome(String nome);
	 
	 public Usuario findByCodUsuario(Integer codUsuario);
	
}