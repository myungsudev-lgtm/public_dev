package com.exam.sample_member.controller;

import com.exam.sample_member.dto.MemberReqDto;
import com.exam.sample_member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/member")
public class MemberApiController {
    private final MemberService memberService;

    @PostMapping("join")
    public ResponseEntity<MemberReqDto> join(@RequestBody MemberReqDto dto){
        memberService.join(dto);
        return ResponseEntity.ok().body(dto);
    }

//    @PostMapping("login")
//    public ResponseEntity<MemberReqDto> login(@RequestBody MemberReqDto dto){
//        memberService.login(dto);
//        return ResponseEntity.ok(dto);
//    }
}
