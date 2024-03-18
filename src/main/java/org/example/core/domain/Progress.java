package org.example.core.domain;

import org.example.core.interfaces.IProgress;

public class Progress implements IProgress {
    private int totalTrails;
    private int solvedTrails;

    public Progress(int totalTrails) {
        this.totalTrails = totalTrails;
        this.solvedTrails = 0;
    }

    public void setTotalTrails(int totalTrails) {
        this.totalTrails = totalTrails;
    }

    public int getSolvedTrails() {
        return solvedTrails;
    }

    @Override
    public int getProgress() {
        return 0;
    }

    @Override
    public void setSolvedTrails(int newProgress) {
        this.solvedTrails = newProgress;
    }
}
