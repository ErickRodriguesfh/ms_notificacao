package br.ebr.ms_notificacao.service;

import br.ebr.ms_notificacao.entity.record.Email;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificacaoEmailService {

    private final EmailService emailService;

    public void notificar(String mensagem, String emailTo) {
        Email email = new Email(emailTo, "Proposta em análise", mensagem);
        emailService.enviarEmail(email);
    }

}
