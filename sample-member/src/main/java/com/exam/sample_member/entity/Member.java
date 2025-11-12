package com.exam.sample_member.entity;

import com.exam.sample_member.dto.MemberReqDto;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;

@Entity
@Table(name = "MEMBER")
@Getter
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String userId;

    @Column(nullable = false)
    private String userPwd;

    @Column(nullable = false)
    private String userNick;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String phone;

    private String address;


    public static Member from(MemberReqDto dto){
        Member member = new Member();
        member.userId  = dto.getUserId();
        member.userPwd = dto.getUserPwd();
        member.userNick = dto.getUserNick();
        member.name = dto.getName();
        member.phone = dto.getPhone();
        member.address = dto.getAddress();
        return member;
    }
}
