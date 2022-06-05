package com.example.msemail.services;


import com.example.msemail.models.EmailModel;
import com.example.msemail.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    EmailRepository emailRepository;


    public void sendEmail(EmailModel emailModel) {
    }
}
