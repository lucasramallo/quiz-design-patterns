package org.example.core.domain;

import org.example.core.interfaces.IQuestion;

import java.util.ArrayList;
import java.util.UUID;

public class Question implements IQuestion {
    private final UUID questionId;
    private String description;

    private ArrayList<Alternative> alternatives;
    public Question(String answer, String description) {
        this.questionId = UUID.randomUUID();
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Alternative> getAlternatives() {
        return alternatives;
    }

    public void setAlternatives(ArrayList<Alternative> alternatives) {
        this.alternatives = alternatives;
    }

    @Override
    public UUID getID() {
        return this.questionId;
    }
}
