package org.example.sportclub.service.impl;

import org.example.sportclub.entity.Member;
import org.example.sportclub.repo.MemberRepository;
import org.example.sportclub.service.MemberService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberServiceImpl implements MemberService {
    private final MemberRepository repo;

    public MemberServiceImpl(MemberRepository repo) {
        this.repo = repo;
    }

    @Override
    public Member create(Member member) {
        return repo.save(member);
    }

    @Override
    public List<Member> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Member> findById(Long id) {
        return repo.findById(id);
    }
}
