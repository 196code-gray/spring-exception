package com.MVC.practice.member.mapper;

import com.MVC.practice.member.Dto.MemberPatchDto;
import com.MVC.practice.member.Dto.MemberPostDto;
import com.MVC.practice.member.Dto.ResponseDto;
import com.MVC.practice.member.entity.Member;
import org.mapstruct.Mapper;

 @Mapper(componentModel = "spring")
    public interface MemberMapper {
        Member PostDtoToMember (MemberPostDto memberPostDto);
        Member PatchDtoToMember (MemberPatchDto memberPatchDto);
        ResponseDto memberToResponseDto (Member member);
    }

