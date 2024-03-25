package org.example.core.repository;

import org.example.core.domain.Trail;
import org.example.core.interfaces.IQuestion;
import org.exemple.core.repository.Repository;

import java.util.ArrayList;
import java.util.UUID;

public class QuestionRepository extends Repository {
    private ArrayList<IQuestion> questions;

    public QuestionRepository() {
        this.questions = new ArrayList<>();
    }

    public void delete(UUID questionId) {
        questions.removeIf(question -> question.getID().equals(questionId));
    }

    public IQuestion getById(UUID questionId) {
        return questions.stream()
                .filter(question -> question.getID().equals(questionId))
                .findFirst()
                .orElse(null);
    }

    public void save(IQuestion question) {
        questions.add(question);
    }

    private void update(IQuestion existingQuestion, IQuestion newQuestion) {
        existingQuestion.setDescription(newQuestion.getDescription());
        existingQuestion.setAlternatives(newQuestion.getAlternatives());
    }
}


