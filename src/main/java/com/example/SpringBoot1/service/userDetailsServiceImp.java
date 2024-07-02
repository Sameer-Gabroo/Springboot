package com.example.SpringBoot1.service;

import com.example.SpringBoot1.Repository.UserRepository;
import com.example.SpringBoot1.Config.SpringSecurity;
import com.example.SpringBoot1.entitiy.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class userDetailsServiceImp implements UserDetailsService {

@Autowired
    private UserRepository UserRepository;




    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User userame = UserRepository.findByUserName(username);
        if (userame != null) {
            return org.springframework.security.core.userdetails.User.builder()
                    .username(userame.getUserName())
                    .password(userame.getPassword())
                    .roles(userame.getRoles()).build();
        }
        throw new UsernameNotFoundException("User not found with username: " + userame);
    }



}
