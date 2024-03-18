package org.example.core.useCase;

import org.example.core.interfaces.IQuestion;

import java.util.ArrayList;
import java.util.UUID;

public class DeleteQuestionUseCase {

    private ArrayList<IQuestion> questions;

    public DeleteQuestionUseCase(ArrayList<IQuestion> questions) {
        this.questions = questions;
    }

    public boolean deleteQuestion(UUID questionId) {
        for (IQuestion question : questions) {
            if (question.getID().equals(questionId)) {
                questions.remove(question);
                return true;
            }
        }
        return false; 
    }
}
