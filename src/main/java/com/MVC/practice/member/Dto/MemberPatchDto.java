package com.MVC.practice.member.Dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Pattern;

@Getter
@Setter
public class MemberPatchDto {
    private long memberId;

    @Pattern(regexp = "^\\S+(\\s?\\S+)*$")
    private String name;

    @Pattern(regexp = "^010-\\d{3,4}-\\d{3,4}$")
    private String phone;

    @Pattern(regexp = "^\\S+(\\s?\\S+)*$")
    private String nickname;
}
