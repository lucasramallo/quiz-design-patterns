package org.example.core.useCase.User;

import org.example.core.domain.User;
import org.example.core.repository.IUserRepository;

import java.util.UUID;

public class EditUserPassword {

    private IUserRepository repository;
    public EditUserPassword(IUserRepository repository) {
        this.repository = repository;
    }

    public void execute(UUID id, String newPassword){
        User user = repository.findUserById(id);
        user.setPassword(newPassword);
        repository.update(user);
    }

}
