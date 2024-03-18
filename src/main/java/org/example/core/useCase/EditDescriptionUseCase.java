package org.example.core.useCase;

import org.example.core.interfaces.IQuestion;

import java.util.ArrayList;
import java.util.UUID;

public class EditDescriptionUseCase {
    private ArrayList<IQuestion> questions;

    public EditDescriptionUseCase(ArrayList<IQuestion> questions) {
        this.questions = questions;
    }

    public boolean editDescription(UUID questionId, String newDescription) {
        for (IQuestion question : questions) {
            if (question.getID().equals(questionId)) {
                question.setDescription(newDescription);
                return true;
            }
        }
        return false; 
    }
}


