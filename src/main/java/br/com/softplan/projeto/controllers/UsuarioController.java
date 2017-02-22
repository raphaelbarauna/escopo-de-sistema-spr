package br.com.softplan.projeto.controllers;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.softplan.projeto.domain.User;
import br.com.softplan.projeto.service.SecurityService;
import br.com.softplan.projeto.service.UserService;
import br.com.softplan.projeto.validator.UserValidator;

@Controller
@Transactional
//@RequestMapping("/usuarios")
public class UsuarioController
{
	@Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;



   @RequestMapping("/usuario")
   public ModelAndView index()
   {
	   
	  ModelAndView modelAndView = new ModelAndView("usuario/index");
	 // modelAndView.addObject("usuario", usuarioDao.findAll());
      return modelAndView;
   }
   
   @RequestMapping(value = "/novo-usuario", method = RequestMethod.GET)
   public String registration(Model model) {
       model.addAttribute("userForm", new User());

       return "usuario/newUser";
   }
   
   @RequestMapping(value="/novo-usuario", method=RequestMethod.POST)
   public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {
       userValidator.validate(userForm, bindingResult);
      
       if (bindingResult.hasErrors()) {
    	   System.out.println("Error ao cadastrar novo usuário");
           return "usuario/newUser";
       }
       userService.save(userForm);

       securityService.autologin(userForm.getUsername(), userForm.getConfirmPassword());

       return "redirect:/home";
   }
   
 
   
  
   
}
