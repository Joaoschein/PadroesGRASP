package com.example.GRASP.PadraoInvencoesPuras;

// Implementação do serviço de notificação via SMS
public class ServicoSMS implements ServicoNotificacao {
    @Override
    public void enviarNotificacao(String destinatario, String assunto, String mensagem) {
        System.out.println("Enviando SMS para: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
    }
}

