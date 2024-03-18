package org.example.core.useCase.User;
import org.example.core.domain.User;
import org.example.core.repository.IUserRepository;

public class CreateUser {
    private IUserRepository repository;

    public CreateUser(IUserRepository repository) {
        this.repository = repository;
    }

    public void execute(String userName, String password, boolean isAdministrator) {
        User user = new User(userName, password, isAdministrator);
        repository.save(user);
    }
}
