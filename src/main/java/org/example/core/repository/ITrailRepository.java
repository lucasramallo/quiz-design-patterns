package org.example.core.repository;
import org.example.core.domain.Trail;
import java.util.UUID;

public interface ITrailRepository {
    public void save(Trail trail);
    public Trail findTrailById(UUID id);
    public void update(Trail trail);
}
