package com.exam.sample_member.todo.service;

import com.exam.sample_member.todo.dto.TodoReqDto;
import com.exam.sample_member.todo.dto.TodoRespDto;
import com.exam.sample_member.todo.entity.Todo;
import com.exam.sample_member.todo.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class TodoService {
    private final TodoRepository todoRepository;
    public TodoRespDto save(TodoReqDto dto) {
        Todo todo = Todo.from(dto);
        Todo save = todoRepository.save(todo);
        return TodoRespDto.from(save);

    }

    public TodoRespDto findById(Long no) {
        Todo todo = todoRepository.findById(no).orElseThrow();
        return TodoRespDto.from(todo);
    }

    public List<TodoRespDto> findAll() {
        List<Todo> todoList = todoRepository.findAll();
        return todoList.stream().map(TodoRespDto::from).toList();
    }

    public TodoRespDto update(TodoReqDto dto) {
        Todo todo = todoRepository.findById(dto.getId()).orElseThrow();
        todo.update(dto);
        return TodoRespDto.from(todo);
    }

    public String delete(Long no) {
        Todo todo = todoRepository.findById(no).orElseThrow();
        todo.delete();
        return "DELETE";
    }
}
4