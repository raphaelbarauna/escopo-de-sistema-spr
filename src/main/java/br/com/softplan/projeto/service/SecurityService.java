package br.com.softplan.projeto.service;




public interface SecurityService {

	  String findLoggedInName();

	    void autologin(String name, String password);
}
