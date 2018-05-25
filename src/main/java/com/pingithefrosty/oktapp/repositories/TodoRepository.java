package com.pingithefrosty.oktapp.repositories;

import com.pingithefrosty.oktapp.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Integer> {
}
