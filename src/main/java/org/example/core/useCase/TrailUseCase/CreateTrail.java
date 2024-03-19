package org.example.core.useCase.TrailUseCase;
import org.example.core.domain.Trail;
import org.example.core.repository.ITrailRepository;

public class CreateTrail {
    private ITrailRepository repository;
    public CreateTrail(ITrailRepository repository){
        this.repository = repository;
    }

    public void execute(String title, String content){
        Trail trail = new Trail(title, content);
        repository.save(trail);
    }
}
