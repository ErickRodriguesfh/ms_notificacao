package br.ebr.ms_notificacao.listener;

import br.ebr.ms_notificacao.constantes.MensagemConstante;
import br.ebr.ms_notificacao.entity.Proposta;
import br.ebr.ms_notificacao.service.NotificacaoEmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PropostaPendenteListener {

    private final NotificacaoEmailService notificacaoEmailService;

    @RabbitListener(queues = "${rabbitmq.queue.proposta.pendente}")
    public void propostaPendente(Proposta proposta) {
        String mensagem = String.format(MensagemConstante.PROPOSTA_EM_ANALISE, proposta.getUsuario().getNome());
        notificacaoEmailService.notificar(mensagem);
    }

}
