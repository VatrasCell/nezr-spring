package com.vatrascell.nezrspring.service;

import com.vatrascell.nezrspring.model.AppUser;
import com.vatrascell.nezrspring.model.CreateAppUserDto;
import com.vatrascell.nezrspring.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@AllArgsConstructor
public class JwtUserDetailsService implements UserDetailsService {

    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser appUser = userRepository.findByUsername(username);
        if(appUser == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new org.springframework.security.core.userdetails.User(appUser.getUsername(), appUser.getPassword(),
                new ArrayList<>());
    }

    public AppUser saveUser(CreateAppUserDto user) {
        AppUser newAppUser = new AppUser();
        newAppUser.setUsername(user.getUsername());
        //newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
        return userRepository.save(newAppUser);
    }
}
