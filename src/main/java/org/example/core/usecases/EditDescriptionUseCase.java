package org.example.core.usecases;

import org.example.core.domain.Trail;
import org.example.core.interfaces.IQuestion;
import org.example.core.repository.QuestionRepository;

import java.util.UUID;

public class EditDescriptionUseCase {
    private Trail trail;
    private QuestionRepository questionRepository;

    public EditDescriptionUseCase(Trail trail, QuestionRepository questionRepository) {
        this.trail = trail;
        this.questionRepository = questionRepository;
    }

    public void editQuestionDescription(UUID questionId, String newDescription) {
        // Verificar se a questão existe na trilha
        IQuestion questionToEdit = questionRepository.findQuestionById(questionId);
        
        if (questionToEdit == null) {
            System.out.println("Questão não encontrada na trilha.");
            return;
        }
        
        // Atualizar a descrição da questão
        questionToEdit.setDescription(newDescription);
        questionRepository.saveQuestion(questionToEdit);
        
        System.out.println("Descrição da questão atualizada com sucesso!");
    }
}
