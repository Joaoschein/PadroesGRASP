package com.example.GRASP.PadraoInvencoesPuras;

import com.example.GRASP.PadraoVariacoesProtegidas.Emprestimo5;
import com.example.GRASP.PadraoVariacoesProtegidas.Livro5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca6 {
    private List<Emprestimo5> emprestimos;
    private ServicoNotificacao servicoNotificacao;

    public Biblioteca6(ServicoNotificacao servicoNotificacao) {
        this.emprestimos = new ArrayList<>();
        this.servicoNotificacao = servicoNotificacao;
    }

    // Registra um empréstimo
    public void registrarEmprestimo(Livro5 livro, String nomeDoUsuario, String emailDoUsuario, LocalDate dataDeDevolucao) {
        Emprestimo5 emprestimo = new Emprestimo5(livro, nomeDoUsuario, emailDoUsuario, dataDeDevolucao);
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado: Livro \"" + livro.getTitulo() + "\" para " + nomeDoUsuario);
    }

    // Calcula multas e notifica usuários com atraso
    public void notificarUsuariosComAtraso() {
        for (Emprestimo5 emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido()) {
                long diasAtraso = emprestimo.calcularDiasAtraso();
                if (diasAtraso > 0) {
                    String mensagem = "Você tem uma multa de R$ " + (diasAtraso * 2.0) +
                            " pelo livro \"" + emprestimo.getLivro().getTitulo() + "\".";
                    servicoNotificacao.enviarNotificacao(emprestimo.getEmailDoUsuario(), "Multa", mensagem);
                }
            }
        }
    }
}

