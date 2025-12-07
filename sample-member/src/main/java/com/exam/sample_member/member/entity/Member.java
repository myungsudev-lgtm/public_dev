package com.exam.sample_member.member.entity;

import com.exam.sample_member.member.dto.MemberReqDto;
import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

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

    private String delYn;

    private LocalDateTime enrollDate;
    private LocalDateTime expiredDate;

    public static Member from(MemberReqDto dto){
        Member member = new Member();
        member.userId  = dto.getUserId();
        member.userPwd = dto.getUserPwd();
        member.userNick = dto.getUserNick();
        member.name = dto.getName();
        member.phone = dto.getPhone();
        member.address = dto.getAddress();
        member.delYn = "N";
        member.enrollDate = LocalDateTime.now();
        return member;
    }

    public void update(MemberReqDto dto) {
        this.userId   = dto.getUserId();
        this.userPwd  = dto.getUserPwd();
        this.userNick = dto.getUserNick();
        this.name     = dto.getName();
        this.phone    = dto.getPhone();
        this.address  = dto.getAddress();
    }

    public void delete() {
        this.delYn = "Y";
        this.expiredDate = LocalDateTime.now();
    }
}
