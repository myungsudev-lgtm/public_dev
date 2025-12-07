package com.exam.sample_member.todo.entity;

import com.exam.sample_member.todo.dto.TodoReqDto;
import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Table(name = "TODO")
@Getter
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    private String content;
    private String delYn;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    public static Todo from(TodoReqDto dto){
        Todo t = new Todo();
        t.title = dto.getTitle();
        t.content = dto.getContent();
        t.delYn = "N";
        t.createdAt = LocalDateTime.now();
        return t;
    }

    public void update(TodoReqDto dto) {
        this.title = dto.getTitle();
        this.content = dto.getContent();
        this.updatedAt = LocalDateTime.now();
    }

    public void delete() {
        this.delYn = "Y";
        this.updatedAt = LocalDateTime.now();
    }
}
