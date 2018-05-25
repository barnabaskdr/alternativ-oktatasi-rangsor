package com.pingithefrosty.oktapp.repositories;

import com.pingithefrosty.oktapp.models.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Integer>{
  List<Assignee> findByName (String name);
  Assignee findOneByName (String name);
  List<Assignee> findByEmail (String email);
}
