package br.com.softplan.projeto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController
{

   @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
   public String index(Model model)
   {
      return "home/index";
   }
   
   @RequestMapping(value = "/login", method = RequestMethod.GET)
   public String login(Model model, String error, String logout) {
       if (error != null)
           model.addAttribute("error", "Your username and password is invalid.");

       if (logout != null)
           model.addAttribute("message", "You have been logged out successfully.");

       return "login/login";
   }
}
