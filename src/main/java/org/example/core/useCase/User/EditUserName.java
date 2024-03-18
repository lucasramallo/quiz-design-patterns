package org.example.core.useCase.User;
import org.example.core.domain.User;
import org.example.core.repository.IUserRepository;
import java.util.UUID;

public class EditUserName {
    private IUserRepository repository;
    public EditUserName(IUserRepository repository) {
        this.repository = repository;
    }

    public void execute(UUID id, String newName){
        User user = repository.findUserById(id);
        user.setUserName(newName);
        repository.update(user);
    }
}
