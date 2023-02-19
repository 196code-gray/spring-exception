package com.MVC.practice.member.Dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Setter
@Getter
public class MemberPostDto {
    @Email
    @NotBlank
    private String email;
    @NotBlank
    @Pattern(regexp = "^\\S+(\\s?\\S+)*$")
    private String name;
    @NotBlank
    @Pattern(regexp = "^010-\\d{3,4}-\\d{3,4}$")
    private String phone;
    @Pattern(regexp = "^\\S+(\\s?\\S+)*$")
    private String nickname;
}
