package com.example.msemail.services;


import com.example.msemail.enums.StatusEmail;
import com.example.msemail.models.EmailModel;
import com.example.msemail.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    EmailRepository emailRepository;

    @Autowired
    private JavaMailSender emailSender;


    public EmailModel sendEmail(EmailModel emailModel) {

        emailModel.setSendDateEmail(LocalDateTime.now());
        try{
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(emailModel.getEmailFrom());
            message.setTo(emailModel.getEmailTo());
            message.setSubject(emailModel.getSubject());
            message.setText(emailModel.getText());
            emailSender.send(message);

            emailModel.setStatusEmail(StatusEmail.SENT);

        } catch (MailException e) {
            emailModel.setStatusEmail(StatusEmail.ERROR);

        } finally {
            return emailRepository.save(emailModel);
        }

    }

    public Page<EmailModel> findAll(Pageable pageable) {
        return emailRepository.findAll(Pageable pageable);
    }

    public Optional<EmailModel> findById(UID emailId) {
        return emailRepository.findById(emailId);
    }
}
