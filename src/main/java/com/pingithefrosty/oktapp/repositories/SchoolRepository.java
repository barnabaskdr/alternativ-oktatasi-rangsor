package com.pingithefrosty.oktapp.repositories;

import com.pingithefrosty.oktapp.models.School;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolRepository extends CrudRepository<School, Integer> {
  List<School> findByName (String name);
  School findOneByName (String name);

}
