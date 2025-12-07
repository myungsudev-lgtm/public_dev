package com.exam.sample_member.todo.repository;

import com.exam.sample_member.todo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo,Long> {

}
