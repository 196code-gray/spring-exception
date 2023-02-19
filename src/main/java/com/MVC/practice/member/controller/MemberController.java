package com.MVC.practice.member.controller;

import com.MVC.practice.member.Dto.MemberPatchDto;
import com.MVC.practice.member.Dto.MemberPostDto;
import com.MVC.practice.member.mapper.MemberMapper;
import com.MVC.practice.member.entity.Member;
import com.MVC.practice.member.service.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/test1/members")
@Validated
public class MemberController {
    private final MemberService memberService;
    private final MemberMapper memberMapper;

    public MemberController(MemberService memberService, MemberMapper memberMapper) {
        this.memberService = memberService;
        this.memberMapper = memberMapper;
    }

    @PostMapping
    public ResponseEntity memberPost(@Valid @RequestBody MemberPostDto memberPostDto) {
        Member member = memberMapper.PostDtoToMember(memberPostDto);
        Member response = memberService.createMember(member);
        return new ResponseEntity<>(memberMapper.memberToResponseDto(response), HttpStatus.CREATED);
    }
    @PatchMapping("/{member-Id}")
    public ResponseEntity memberPatch(@PathVariable("member-Id") long memberId, @Valid @RequestBody MemberPatchDto memberPatchDto) {
        memberPatchDto.setMemberId(memberId);
        Member member = memberMapper.PatchDtoToMember(memberPatchDto);
        Member response = memberService.updateMember(member);
        return new ResponseEntity<>(memberMapper.memberToResponseDto(response), HttpStatus.OK);
    }
    @GetMapping("/{member-Id}")
    public ResponseEntity getmember (@PathVariable("member-Id") long memberId) {
        Member response = memberService.getMember(memberId);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity getAllmember () {
        List<Member> response = memberService.allMember();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
