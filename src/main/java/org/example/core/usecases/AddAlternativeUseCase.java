package org.example.core.usecases;

import org.example.core.domain.Trail;
import org.example.core.domain.Alternative;
import org.example.core.interfaces.IQuestion;
import org.example.core.repository.QuestionRepository;

import java.util.UUID;

public class AddAlternativeUseCase {
    private Trail trail;
    private QuestionRepository questionRepository;

    // SOLID (D)
    public AddAlternativeUseCase(Trail trail, QuestionRepository questionRepository) {
        this.trail = trail;
        this.questionRepository = questionRepository;
    }

    public void addAlternative(UUID questionId, String content, boolean isCorrect) {
        // Verificar se a questão existe na trilha
        IQuestion question = questionRepository.findQuestionById(questionId);
        
        if (question == null) {
            System.out.println("Questão não encontrada na trilha.");
            return;
        }

        // Criar a nova alternativa
        Alternative newAlternative = new Alternative(content, isCorrect);

        // Adicionar a alternativa à questão
        question.getAlternatives().add(newAlternative);
        questionRepository.saveQuestion(question);

        System.out.println("Alternativa adicionada com sucesso à questão!");
    }
}
