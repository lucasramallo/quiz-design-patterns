package org.example.core.useCase.TrailUseCase;
import org.example.core.domain.Trail;
import org.example.core.repository.ITrailRepository;

import java.util.UUID;

public class FinishTrail {
    private ITrailRepository repository;

    public FinishTrail(ITrailRepository repository){
        this.repository = repository;
    }

    public void execute(UUID id){
        Trail trail = repository.findTrailById(id);
        trail.setFinished(true);
        repository.update(trail);
    }
}
