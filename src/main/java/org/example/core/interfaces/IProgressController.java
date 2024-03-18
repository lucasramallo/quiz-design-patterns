package org.example.interfaces;

public interface IProgressController {
    public int getProgress();
    public void upSolvedTrails(int newProgress);
    public int calculateProgressInPercentage();
}