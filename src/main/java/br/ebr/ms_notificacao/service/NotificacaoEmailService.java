package br.ebr.ms_notificacao.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificacaoEmailService {

    public void notificar(String mensagem) {
        System.out.println(mensagem);
    }

}
