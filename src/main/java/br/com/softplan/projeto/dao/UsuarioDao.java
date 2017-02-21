package br.com.softplan.projeto.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.softplan.projeto.domain.Usuario;

@Repository
@Transactional
public class UsuarioDao {
  
  /**
   * Save the user in the database.
   */
  public void create(Usuario user) {
    entityManager.persist(user);
    return;
  }
  
  /**
   * Delete the user from the database.
   */
  public void delete(Usuario user) {
    if (entityManager.contains(user))
      entityManager.remove(user);
    else
      entityManager.remove(entityManager.merge(user));
    return;
  }
  
  /**
   * Return all the users stored in the database.
   */
  @SuppressWarnings("unchecked")
  public List findAll() {
    return entityManager.createQuery("from usuario").getResultList();
  }
  
  /**
   * Return the user having the passed email.
   */
 

  /**
   * Return the user having the passed id.
   */
  public Usuario getById(Integer getCodUf) {
    return entityManager.find(Usuario.class, getCodUf);
  }

  /**
   * Update the passed user in the database.
   */

  // Private fields
  
  // An EntityManager will be automatically injected from entityManagerFactory
  // setup on DatabaseConfig class.
  @PersistenceContext
  private EntityManager entityManager;
  
}