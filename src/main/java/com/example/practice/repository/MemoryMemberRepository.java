package com.example.practice.repository;

import com.example.practice.domain.Member;

import java.util.List;
import java.util.Optional;

public class MemoryMemberRepository implements MemberRepository {
    Member member;

    public Member save(Member member){
        member.setId("qwer1234");
        member.setName("이홍영");
        return member;
    }
    public Optional<Member> findById(String id){
        return Optional.ofNullable(member);
    }
    public Optional<Member> findByName(String Name){
        return Optional.ofNullable(member);
    }
    public List<Member> findAll(){
        return List.of(member);
    }
}
