package org.example.interfaces;

import java.util.List;

public interface App {
    Boolean cadastrarUsuario(String login, String senha);
    Boolean logarUsuario(String login, String senha);
    void excluirConta();
    void alterarSenha(String novaSenha);
    void alterarLogin(String novoLogin);
    void iniciarTrilha();
    void finalizarTrilha();
    void cadastrarTrilha();
    void cadastrarPergunta();
    void editarPergunta(Pergunta pergunta, String novePergunta, List<String> alternativas);
    void removerPergunta(int perguntaID);
    void cadastrarConteudo(String conteudo);
    void editarConteudo();
    void editarNomeDaTrilha(Trilha trilha, String novoNome);
    void removerTrilha(int trilhaID);
    void calcularProgresso(int numeroDeTrilhas, int trilhasFinalizadas);
    int verificarProgresso();
    boolean verificarResposta(Pergunta pergunta, int indexResposta);

}
