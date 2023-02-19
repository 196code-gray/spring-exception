package com.MVC.practice.member.service;

import com.MVC.practice.member.entity.Member;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    public Member createMember(Member member) {
        return member;
    }
    public Member updateMember (Member member) {
        return member;
    }
    public Member getMember (long memberId) {
        return new Member(memberId, "naver@naver.com", "네이버", "010-1111-2222", "닉네임");
    }
    public List<Member> allMember () {
        List<Member> response = List.of(
                new Member(1, "naver@naver.com", "네이버", "010-1111-2222", "네이버닉네임"),
                new Member(2, "google@google.com", "구글", "010-1111-1111", "구글닉네임"),
                new Member(3, "nate@nate.com", "네이트", "010-0101-1010", "네이트닉네임")
        );
        return response;
    }
}
