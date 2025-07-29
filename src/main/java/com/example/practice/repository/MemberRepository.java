package com.example.practice.repository;

import com.example.practice.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<String> findById(Member member);
    // Optional은 값이 존재할 수도 존재하지 않을 수도 있다. NullPointerException 예외를 방지할 수 있고, 코드의 안정성을 높이며 가독성을 향상시킨다.
    Optional<String> findByName(Member member);
    List<Member> findAll(Member member);
}
