package br.com.softplan.projeto.service;

import org.springframework.stereotype.Component;

import br.com.softplan.projeto.domain.User;

@Component("UserService")
public interface UserService {

    void save(User user);

    User findByUsername(String name);
}
