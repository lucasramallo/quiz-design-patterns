package org.example.core.domain;
import org.example.core.interfaces.IQuestion;

import java.util.ArrayList;
import java.util.UUID;

public class Trail {
    private final UUID id;
    private String content;
    private String title;
    private boolean isFinished;
    private ArrayList<IQuestion> questions;
    public Trail(String title, String content) {
        this.id = UUID.randomUUID();
        this.content = content;
        this.title = title;
        this.isFinished = false;
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
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public boolean isFinished() {
        return isFinished;
    }
    public void setFinished(boolean finished) {
        this.isFinished = finished;
    }
    public ArrayList<IQuestion> getQuestions() {
        return questions;
    }
    public void setQuestions(ArrayList<IQuestion> questions) {
        this.questions = questions;
    }
}