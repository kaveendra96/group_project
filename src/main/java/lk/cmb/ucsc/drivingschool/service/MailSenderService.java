package lk.cmb.ucsc.drivingschool.service;


import lk.cmb.ucsc.drivingschool.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class MailSenderService {

    @Autowired
    private JavaMailSender mailSender;

    // Use it to send Simple text emails
    public void sendSimpleMail(Email mail) {

        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(mail.getTo());
        message.setSubject(mail.getSubject());
        message.setText(mail.getContent());

        mailSender.send(message);
    }

    // Use it to send HTML emails
    public void sendHTMLMail(Email mail) throws MessagingException {

        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, false, "utf-8");

        helper.setTo(mail.getTo());
        helper.setSubject(mail.getSubject());
        message.setContent(mail.getContent(), "text/html");

        mailSender.send(message);
    }
}
