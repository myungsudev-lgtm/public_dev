package com.exam.sample_member.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberReqDto {
    private String userId;
    private String userPwd;
    private String userNick;
    private String name;
    private String phone;
    private String address;
}
