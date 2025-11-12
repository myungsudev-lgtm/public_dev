package com.exam.sample_member.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MemberRespDto {
    private String userId;
    private String userPwd;
    private String userNick;
    private String name;
    private String phone;
    private String address;
}
