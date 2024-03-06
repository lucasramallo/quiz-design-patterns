package org.example.domain;

public class Alternative {
    private String content;
    private boolean isCorrect;

    public Alternative(String content, boolean isCorrect) {
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



}
