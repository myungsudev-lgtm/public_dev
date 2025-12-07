package com.exam.sample_member.todo.controller;

import com.exam.sample_member.todo.dto.TodoReqDto;
import com.exam.sample_member.todo.dto.TodoRespDto;
import com.exam.sample_member.todo.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
@RequiredArgsConstructor
public class TodoApiController {
    private final TodoService todoService;

    @PostMapping
    public ResponseEntity<TodoRespDto> insert(@RequestBody TodoReqDto dto){
        TodoRespDto respDto = todoService.save(dto);
        return ResponseEntity.ok().body(respDto);
    }

    @GetMapping("{no}")
    public ResponseEntity<TodoRespDto> findById(@PathVariable Long no){
        TodoRespDto dto = todoService.findById(no);
        return ResponseEntity.ok().body(dto);
    }

    @GetMapping("list")
    public ResponseEntity<List<TodoRespDto>> findAll(){
        List<TodoRespDto> dtoList = todoService.findAll();
        return ResponseEntity.ok().body(dtoList);
    }

    @PutMapping
    public ResponseEntity<TodoRespDto> update(@RequestBody TodoReqDto dto){
        TodoRespDto update = todoService.update(dto);
        return ResponseEntity.ok().body(update);
    }
    @DeleteMapping("{no}")
    public ResponseEntity<String> delete(@PathVariable Long no){
        String delete = todoService.delete(no);
        return ResponseEntity.ok().body(delete);
    }
}
