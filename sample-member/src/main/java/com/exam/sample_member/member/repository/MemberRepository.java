package com.exam.sample_member.member.repository;

import com.exam.sample_member.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {

    Member findByUserIdAndDelYn(String userId, String n);
}
