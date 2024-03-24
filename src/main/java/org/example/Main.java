package org.example;

import org.example.core.domain.Trail;
import org.example.core.domain.Alternative;
import org.example.core.interfaces.IQuestion;
import org.example.core.repository.QuestionRepository;
import org.example.core.usecases.*;

import java.util.ArrayList;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        // Criar uma trilha
        Trail trail = new Trail("Trilha de Teste");

        // Criar um repositório de questões
        QuestionRepository questionRepository = new QuestionRepository();

        // Caso de Uso: Criar Questão
        CreateQuestionUseCase createQuestionUseCase = new CreateQuestionUseCase(trail, questionRepository);
        ArrayList<Alternative> alternatives = new ArrayList<>();
        Alternative alternative1 = new Alternative("Alternativa 1", true);
        Alternative alternative2 = new Alternative("Alternativa 2", false);
        alternatives.add(alternative1);
        alternatives.add(alternative2);
        createQuestionUseCase.createQuestion("Descrição da Questão", alternatives);

        // Caso de Uso: Adicionar Alternativa
        AddAlternativeUseCase addAlternativeUseCase = new AddAlternativeUseCase(trail, questionRepository);
        addAlternativeUseCase.addAlternative(questionRepository.findQuestionById(trail.getQuestions().get(0).getID()).getID(), "Nova Alternativa", true);

        // Caso de Uso: Deletar Alternativa
        DeleteAlternativeUseCase deleteAlternativeUseCase = new DeleteAlternativeUseCase(trail, questionRepository);
        deleteAlternativeUseCase.deleteAlternative(questionRepository.findQuestionById(trail.getQuestions().get(0).getID()).getID(), alternative1.getAlternativeId());

        // Caso de Uso: Deletar Questão
        DeleteQuestionUseCase deleteQuestionUseCase = new DeleteQuestionUseCase(trail, questionRepository);
        deleteQuestionUseCase.deleteQuestion(questionRepository.findQuestionById(trail.getQuestions().get(0).getID()).getID());
    }
}
