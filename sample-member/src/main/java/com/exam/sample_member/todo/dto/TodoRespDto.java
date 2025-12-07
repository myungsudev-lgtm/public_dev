package com.exam.sample_member.todo.dto;

import com.exam.sample_member.todo.entity.Todo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TodoRespDto {
    private String title;
    private String content;

    public static TodoRespDto from(Todo todo){
        TodoRespDto dto = new TodoRespDto();
        dto.title = todo.getTitle();
        dto.content = todo.getContent();;
        return dto;
    }
}
