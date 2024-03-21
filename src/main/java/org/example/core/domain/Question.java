package org.example.core.domain;

import org.example.core.interfaces.IQuestion;

import java.util.ArrayList;
import java.util.UUID;

public class Question implements IQuestion {
    private final UUID questionId;
    private String description;    
    private ArrayList<Alternative> alternatives;
    private Trail trail;

    public Question(String description, ArrayList<Alternative> alternatives, Trail trail) {
        this.questionId = UUID.randomUUID();
        this.description = description;
        this.alternatives = alternatives;
        this.trail = trail;
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

    public Trail getTrail() {
        return trail;
    }

    public void setTrail(Trail trail) {
        this.trail = trail;
    }
}
