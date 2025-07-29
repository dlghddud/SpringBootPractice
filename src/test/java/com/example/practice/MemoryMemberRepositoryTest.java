package com.example.practice;

import com.example.practice.domain.Member;
import com.example.practice.repository.MemoryMemberRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();



    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }

    @Test
    public void testSave() {
        Member member = new Member();
        member.setId("asd123");
        member.setName("이홍영");
        Member result = repository.save(member);
        assertThat(result).isEqualTo(member);
    }
}
