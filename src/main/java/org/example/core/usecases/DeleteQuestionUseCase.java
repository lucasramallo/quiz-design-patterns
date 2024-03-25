package org.example.core.usecases;

import org.example.core.domain.Trail;
import org.example.core.interfaces.IQuestion;
import org.example.core.repository.QuestionRepository;

import java.util.UUID;

public class DeleteQuestionUseCase {
    private Trail trail;
    private QuestionRepository questionRepository;

    // SOLID (D)
    public DeleteQuestionUseCase(Trail trail, QuestionRepository questionRepository) {
        this.trail = trail;
        this.questionRepository = questionRepository;
    }

    public void deleteQuestion(UUID questionId) {
        // Verificar se a questão existe na trilha
        IQuestion questionToDelete = questionRepository.findQuestionById(questionId);
        
        if (questionToDelete == null) {
            System.out.println("Questão não encontrada na trilha.");
        }
        trail.getQuestions().remove(questionToDelete);
        System.out.println("Questão removida com sucesso!");
    }
}