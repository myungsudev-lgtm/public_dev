package com.exam.sample_member.service;

import com.exam.sample_member.dto.MemberReqDto;
import com.exam.sample_member.entity.Member;
import com.exam.sample_member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public void join(MemberReqDto dto) {
        Member member = Member.from(dto);
        memberRepository.save(member);
    }


}
