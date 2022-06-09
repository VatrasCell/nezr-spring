package com.vatrascell.nezrspring.repository;

import com.vatrascell.nezrspring.model.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {
}
