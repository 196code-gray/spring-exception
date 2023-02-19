package com.MVC.practice.member.mapper;

import com.MVC.practice.member.Dto.MemberPatchDto;
import com.MVC.practice.member.Dto.MemberPostDto;
import com.MVC.practice.member.Dto.ResponseDto;
import com.MVC.practice.member.entity.Member;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-19T15:59:34+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.17 (Azul Systems, Inc.)"
)
@Component
public class MemberMapperImpl implements MemberMapper {

    @Override
    public Member PostDtoToMember(MemberPostDto memberPostDto) {
        if ( memberPostDto == null ) {
            return null;
        }

        Member member = new Member();

        member.setEmail( memberPostDto.getEmail() );
        member.setName( memberPostDto.getName() );
        member.setPhone( memberPostDto.getPhone() );
        member.setNickname( memberPostDto.getNickname() );

        return member;
    }

    @Override
    public Member PatchDtoToMember(MemberPatchDto memberPatchDto) {
        if ( memberPatchDto == null ) {
            return null;
        }

        Member member = new Member();

        member.setMemberId( memberPatchDto.getMemberId() );
        member.setName( memberPatchDto.getName() );
        member.setPhone( memberPatchDto.getPhone() );
        member.setNickname( memberPatchDto.getNickname() );

        return member;
    }

    @Override
    public ResponseDto memberToResponseDto(Member member) {
        if ( member == null ) {
            return null;
        }

        ResponseDto responseDto = new ResponseDto();

        responseDto.setMemberId( member.getMemberId() );
        responseDto.setEmail( member.getEmail() );
        responseDto.setName( member.getName() );
        responseDto.setPhone( member.getPhone() );
        responseDto.setNickname( member.getNickname() );

        return responseDto;
    }
}
