package org.example.core.domain;

import org.example.core.interfaces.IQuestion;

import java.util.ArrayList;
import java.util.UUID;

// SOLID (S)
public class Trail {
    private final UUID id;
    private String title;
    private boolean status;
    private ArrayList<IQuestion> questions;

    public Trail(String title) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.status = false;
        this.questions = new ArrayList<>();
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public ArrayList<IQuestion> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<IQuestion> questions) {
        this.questions = questions;
    }
}