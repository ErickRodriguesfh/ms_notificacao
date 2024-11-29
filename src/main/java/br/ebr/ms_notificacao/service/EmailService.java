package br.ebr.ms_notificacao.service;

import br.ebr.ms_notificacao.entity.record.Email;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {

    private final JavaMailSender javaMailSender;

    public void enviarEmail(Email email) {
        var message = new SimpleMailMessage();
        message.setFrom("erickrodrigues0150@gmail.com");
        message.setTo(email.to());
        message.setSubject(email.subject());
        message.setText(email.body());
        javaMailSender.send(message);
    }

}
