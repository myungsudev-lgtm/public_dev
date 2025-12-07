package com.exam.sample_member.member.controller;

import com.exam.sample_member.member.dto.MemberReqDto;
import com.exam.sample_member.member.dto.MemberRespDto;
import com.exam.sample_member.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/member")
@CrossOrigin("*")
public class MemberApiController {
    private final MemberService memberService;

    @PostMapping("join")
    public ResponseEntity<MemberReqDto> join(@RequestBody MemberReqDto dto){
        memberService.join(dto);
        return ResponseEntity.ok().body(dto);
    }

    @PostMapping("login")
    public ResponseEntity<MemberReqDto> login(@RequestBody MemberReqDto dto){
        memberService.login(dto);
        return ResponseEntity.ok(dto);
    }

    @GetMapping()
    public List<MemberRespDto> memberList(){
        return memberService.findAllMember();
    }

    @GetMapping("{no}")
    public void selectOne(@PathVariable Long no){
        MemberRespDto respDto = memberService.selectOne(no);
    }

    @PutMapping()
    public ResponseEntity<MemberRespDto> update(@RequestBody MemberReqDto dto){
        MemberRespDto update = memberService.update(dto);
        return ResponseEntity.ok().body(update);
    }

    @DeleteMapping("{no}")
    public void delete(@PathVariable Long no){
        String delete = memberService.delete(no);
        ResponseEntity.ok().body(delete);
    }
}
