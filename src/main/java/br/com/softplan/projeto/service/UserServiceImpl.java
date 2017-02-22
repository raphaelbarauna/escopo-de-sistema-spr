package br.com.softplan.projeto.service;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.softplan.projeto.domain.User;
import br.com.softplan.projeto.repositories.RoleRepository;
import br.com.softplan.projeto.repositories.UserRepository;


@Service
@Transactional
public class UserServiceImpl implements UserService {
	
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
    	System.out.println(user);
    	
    	/*Criar verifiação de usuarios*/    	
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));       
        user.setRoles(new HashSet<>(roleRepository.findAll()));
        userRepository.save(user);
    }

    @Override
    public User findByUsername(String name) {
    	
        return userRepository.findByUsername(name);
    }

}
