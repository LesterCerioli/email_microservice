package com.example.msemail.models;

import lombok.Data;



@Data
@Entity
@Table(name="TBL_EMA
public class EmailModel {

    private static final long serialVersionUID = 1;

    @Id
    @Generatedvalue(strategy= GenerationType.AUTO)
    private Long emailId;

    private String ownerRef;

    private String emailFrom;

    private String emailTo;

    private String subject;

    @Column(columnDefinition = "TEXT")
    private String text;

    private LocalDateTime sendDate;

    private StatusEmail statusEmail;
    
}