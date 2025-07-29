package com.example.practice.repository;

import com.example.practice.domain.Member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class MemoryMemberRepository implements MemberRepository {

    public Map<String, Member> members = new HashMap<>();

    public Member save(Member member){
        members.put(member.getId(), member);
        return member;
    }

    public Optional<String> findById(Member member){
        return Optional.ofNullable(member.getId());
    }

    public Optional<String> findByName(Member member){
        return Optional.ofNullable(member.getName());
    }

    public List<Member> findAll(Member member){
        return List.of(member);
    }
    public void clearStore(){
        members.clear();
    }
}