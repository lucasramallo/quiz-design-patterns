package org.example.core.repository;

import org.example.core.domain.Trail;
import org.example.core.interfaces.IQuestion;

import java.util.ArrayList;
import java.util.UUID;

public class QuestionRepository {
    private ArrayList<IQuestion> questions;

    public QuestionRepository() {
        this.questions = new ArrayList<>();
    }

    public void addQuestion(IQuestion question) {
        questions.add(question);
    }

    public void removeQuestion(UUID questionId) {
        questions.removeIf(question -> question.getID().equals(questionId));
    }

    public IQuestion findQuestionById(UUID questionId) {
        return questions.stream()
                .filter(question -> question.getID().equals(questionId))
                .findFirst()
                .orElse(null);
    }

    public void saveQuestion(IQuestion question) {
        IQuestion existingQuestion = findQuestionById(question.getID());
        if (existingQuestion != null) {
            updateExistingQuestion(existingQuestion, question);
            return;
        }
        addQuestion(question);
    }

    private void updateExistingQuestion(IQuestion existingQuestion, IQuestion newQuestion) {
        existingQuestion.setDescription(newQuestion.getDescription());
        existingQuestion.setAlternatives(newQuestion.getAlternatives());
    }
}


