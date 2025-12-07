package com.exam.sample_member.member.service;

import com.exam.sample_member.member.dto.MemberReqDto;
import com.exam.sample_member.member.dto.MemberRespDto;
import com.exam.sample_member.member.entity.Member;
import com.exam.sample_member.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public MemberRespDto join(MemberReqDto dto) {
        Member member = Member.from(dto);
        Member save = memberRepository.save(member);
        return MemberRespDto.from(save);
    }


    public MemberRespDto login(MemberReqDto dto) {
        Member member = memberRepository.findByUserIdAndDelYn(dto.getUserId(), "N");
        if(member.getUserPwd() != dto.getUserPwd()){
            throw new IllegalStateException("wrong pwd");
        }
        return MemberRespDto.from(member);
    }

    public List<MemberRespDto> findAllMember() {
        List<Member> memberList = memberRepository.findAll();
        return memberList.stream().map(MemberRespDto::from).toList();
    }

    public MemberRespDto selectOne(Long no) {
        Member member = memberRepository.findById(no).orElseThrow();
        return MemberRespDto.from(member);
    }

    public MemberRespDto update(MemberReqDto dto) {
        Member member = memberRepository.findById(dto.getId()).orElseThrow();
        member.update(dto);
        return MemberRespDto.from(member);
    }

    public String delete(Long no) {
        Member member = memberRepository.findById(no).orElseThrow();
        member.delete();
        return "deleted";
    }
}
