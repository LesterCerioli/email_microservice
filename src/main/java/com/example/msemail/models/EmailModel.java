package com.example.msemail.models;

import com.example.msemail.enums.StatusEmail;
import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "TBL_EMAIL")
public class EmailModel implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID emailId;

    private String ownerRef;

    private String emailFrom;

    private String emailTo;

    private String subject;

    @Column(columnDefinition = "TEXT")
    private String text;

    private LocalDateTime sendDateEmail;

    private StatusEmail statusEmail;


}
