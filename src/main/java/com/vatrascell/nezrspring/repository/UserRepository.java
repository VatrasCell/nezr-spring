package com.vatrascell.nezrspring.repository;

import com.vatrascell.nezrspring.model.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<AppUser, Integer> {

    AppUser findByUsername(String username);
}
