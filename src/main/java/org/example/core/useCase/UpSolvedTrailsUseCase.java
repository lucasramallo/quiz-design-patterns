package org.example.core.useCase;

import org.example.core.domain.Progress;

public class UpSolvedTrailsUseCase {
    private Progress progress;

    public UpSolvedTrailsUseCase(Progress progress){
        this.progress = progress;
    }
    
    public void upSolvedTrails(){
        int newProgress = this.progress.getSolvedTrails() + 1; 
        this.progress.setSolvedTrails(newProgress);
    }
}
