package org.example.core.usecases;

import org.example.core.domain.Trail;
import org.example.core.domain.Alternative;
import org.example.core.domain.Question;
import org.example.core.interfaces.IQuestion;
import org.example.core.repository.QuestionRepository;

import java.util.ArrayList;
import java.util.UUID;

public class CreateQuestionUseCase {
    private Trail trail;
    private QuestionRepository questionRepository;

    public CreateQuestionUseCase(Trail trail, QuestionRepository questionRepository) {
        this.trail = trail;
        this.questionRepository = questionRepository;
    }

    public void createQuestion(String description, ArrayList<Alternative> alternatives) {
        // Criar uma nova questão
        IQuestion question = new Question(description, alternatives, trail);

        // Adicionar a questão ao repositório
        questionRepository.addQuestion(question);

        System.out.println("Questão criada com sucesso!");
    }
}
