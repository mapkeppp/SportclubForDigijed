package org.example.sportclub.controller;

import org.example.sportclub.entity.Member;
import org.example.sportclub.service.MemberService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {
    private final MemberService svc;

    public MemberController(MemberService svc) {
        this.svc = svc;
    }

    @GetMapping
    public List<Member> all() {
        return svc.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Member> one(@PathVariable Long id) {
        return svc.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Member create(@RequestBody Member member) {
        return svc.create(member);
    }
}
