package br.ebr.ms_notificacao.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Proposta {

    private Long id;
    private Double valorSolicitado;
    private Integer prazoPagamento;
    private Boolean aprovada;
    private Boolean integrada;
    private String observacao;
    private Usuario usuario;

}