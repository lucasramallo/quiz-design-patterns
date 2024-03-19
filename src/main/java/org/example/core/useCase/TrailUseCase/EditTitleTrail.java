package org.example.core.useCase.TrailUseCase;
import org.example.core.domain.Trail;
import org.example.core.repository.ITrailRepository;

import java.util.UUID;

public class EditTitleTrail {
    private ITrailRepository repository;
    public EditTitleTrail(ITrailRepository repository){
        this.repository = repository;
    }
    public void execute(UUID id, String newTitle){
        Trail trail = repository.findTrailById(id);
        trail.setTitle(newTitle);
        repository.update(trail);
    }
}
