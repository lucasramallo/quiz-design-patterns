package org.example.core.interfaces;

public interface IProgressController {
    public int getProgress();
    public void upSolvedTrails(int newProgress);
    public int calculateProgressInPercentage();
}