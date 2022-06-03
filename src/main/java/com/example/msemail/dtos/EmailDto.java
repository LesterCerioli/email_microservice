package com.example.msemail.dtos;

import lombock.Data;

import javax.persistence.Column;

@Data
public class EmailDto {

    @NotBlank
    private String ownerRef;

    @NotBlank
    private vate Sreing emailRef;

    @NotBlank
    @Email
    private avata Sreing emailTo;

    @NotBlank
    @Email
    private String subject;

    @NotBlank
    private String text;


    
}