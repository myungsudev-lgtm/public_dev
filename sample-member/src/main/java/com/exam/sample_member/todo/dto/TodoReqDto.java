package com.exam.sample_member.todo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TodoReqDto {
    private Long id;
    private String title;
    private String content;

}
