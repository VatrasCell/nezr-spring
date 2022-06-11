package com.vatrascell.nezrspring.repository;

import com.vatrascell.nezrspring.model.Hello;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloRepository extends CrudRepository<Hello, Integer> {
}
