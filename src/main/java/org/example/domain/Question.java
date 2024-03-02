package org.example.domain;

import org.example.interfaces.IQuestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class Question implements IQuestion {
    private final UUID questionId;
    private String answer;
    private String description;
    private HashMap<String, Boolean> alternatives;

    public Question(String answer, String description) {
        this.questionId = UUID.randomUUID();
        this.answer = answer;
        this.description = description;
    }

    @Override
    public UUID getID() {
        return null;
    }

    @Override
    public int getAnswer() {
        return 0;
    }
}
