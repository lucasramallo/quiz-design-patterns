package org.example.core.domain;

import java.util.UUID;

public class Alternative {
    private final UUID alternativeId;
    private String content;
    private boolean isCorrect;

    public Alternative(String content, boolean isCorrect) {
        this.alternativeId = UUID.randomUUID();
        this.content = content;
        this.isCorrect = isCorrect;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public UUID getAlternativeId() {
        return alternativeId;
    }
}
