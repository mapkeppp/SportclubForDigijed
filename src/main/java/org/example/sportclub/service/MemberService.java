package org.example.sportclub.service;

import org.example.sportclub.entity.Member;

import java.util.List;
import java.util.Optional;

public interface MemberService {
    Member create(Member member);
    List<Member> findAll();
    Optional<Member> findById(Long id);
}
