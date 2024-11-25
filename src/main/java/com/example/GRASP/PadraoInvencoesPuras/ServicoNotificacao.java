package com.example.GRASP.PadraoInvencoesPuras;

// Interface para diferentes tipos de serviços de notificação
public interface ServicoNotificacao {
    void enviarNotificacao(String destinatario, String assunto, String mensagem);
}

