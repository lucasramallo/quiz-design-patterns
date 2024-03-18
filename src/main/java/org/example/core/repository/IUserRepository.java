package org.example.core.repository;
import org.example.core.domain.User;
import java.util.UUID;

public interface IUserRepository {
    public void save(User user);
    public User findUserById(UUID id);
    public void update(User user);
}
