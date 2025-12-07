package com.exam.sample_member.member.dto;

import com.exam.sample_member.member.entity.Member;
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

    public static MemberRespDto from(Member member){
        MemberRespDto respDto = new MemberRespDto();
        respDto.userId = member.getUserId();
        respDto.userNick = member.getUserNick();
        return respDto;
    }
}
