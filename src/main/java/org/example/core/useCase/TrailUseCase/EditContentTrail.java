package org.example.core.useCase.TrailUseCase;

import org.example.core.domain.Trail;
import org.example.core.repository.ITrailRepository;

import java.util.UUID;

public class EditContentTrail {

    private ITrailRepository repository;
    public EditContentTrail(ITrailRepository repository){
        this.repository = repository;
    }
    public void execute(UUID id, String newContent){
        Trail trail = repository.findTrailById(id);
        trail.setTitle(newContent);
        repository.update(trail);
    }
}
