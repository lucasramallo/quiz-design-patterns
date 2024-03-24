package org.example.core.interfaces;

import org.example.core.domain.Alternative;
import org.example.core.domain.Question;

import java.util.ArrayList;
import java.util.UUID;

public interface IQuestionController {
    public boolean isCorrectAlternative(UUID id);
    public void createQuestion(String description, ArrayList<Alternative> alternatives);
    public void deleteQuestion(UUID id);
    public void editDescription(UUID id, String newDescription);
    public void addAlternative(String content, boolean isCorrect);
    public void deleteAlternative(UUID id);
    public Question getQuestion(UUID id);
    public ArrayList<Question> getQuestions();
}