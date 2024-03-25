package org.example.core.usecases;

import org.example.core.domain.Trail;
import org.example.core.domain.Alternative;
import org.example.core.interfaces.IQuestion;
import org.example.core.repository.QuestionRepository;

import java.util.UUID;

public class DeleteAlternativeUseCase {
    private Trail trail;
    private QuestionRepository questionRepository;

    // SOLID (D)
    public DeleteAlternativeUseCase(Trail trail, QuestionRepository questionRepository) {
        this.trail = trail;
        this.questionRepository = questionRepository;
    }

    public void deleteAlternative(UUID questionId, UUID alternativeId) {
        // Verificar se a questão existe na trilha
        IQuestion question = questionRepository.findQuestionById(questionId);
        
        if (question == null) {
            System.out.println("Questão não encontrada na trilha.");
            return;
        }

        // Verificar se a alternativa existe na questão
        Alternative alternativeToDelete = question.getAlternatives().stream()
                .filter(alternative -> alternative.getAlternativeId().equals(alternativeId))
                .findFirst()
                .orElse(null);

        if (alternativeToDelete == null) {
            System.out.println("Alternativa não encontrada na questão.");
            return;
        }

        // Remover a alternativa da questão
        question.getAlternatives().remove(alternativeToDelete);
        questionRepository.saveQuestion(question);

        System.out.println("Alternativa removida com sucesso da questão!");
    }
}
