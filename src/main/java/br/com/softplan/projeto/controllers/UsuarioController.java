package br.com.softplan.projeto.controllers;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.softplan.projeto.dao.UsuarioDao;
import br.com.softplan.projeto.domain.Usuario;

@Controller
@Transactional
@RequestMapping("/usuarios")
public class UsuarioController
{
	
    @Autowired
    private UsuarioDao usuarioDao;

   @RequestMapping("/usuario")
   public ModelAndView index()
   {
	   
	  ModelAndView modelAndView = new ModelAndView("usuario/index");
	 // modelAndView.addObject("usuario", usuarioDao.findAll());
      return modelAndView;
   }
   
   @RequestMapping(value="/novo-usuario", method=RequestMethod.POST)
   public ModelAndView cadastrarUsuario(Usuario usuario)
   {
	   	  	   
	  usuarioDao.create(usuario); 
	   
	   ModelAndView modelAndView = new ModelAndView("usuario/index");	  
	   return modelAndView;
   }
   
   @RequestMapping("/editar-usuario")
   public ModelAndView editarUsuario()
   {
	   	   
	   ModelAndView modelAndView = new ModelAndView("usuario/editar");
	   return modelAndView;
   }
   
   @RequestMapping(value="/atualizar-usuario", method=RequestMethod.POST)
   public String atualizarUsuario(Usuario usuario)
   {
	    
	  
	   return "usuario/index";
   }
   
  
   @RequestMapping(value="/deletar-usuario", method=RequestMethod.DELETE)
   public ModelAndView deletarUsuario()
   {
	   	   
	   ModelAndView modelAndView = new ModelAndView("usuario/index");
	   return modelAndView;
   }
   
}
