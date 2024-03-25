package org.example.core.interfaces;
import org.example.core.domain.User;
import java.util.UUID;

// SOLID (I)
public interface IUserController {
    public void changePassword(String novaSenha);
    public void changeLogin(String novoLogin);
    public boolean answerQuestion(UUID questionID, int answer);
    public void createUser(String userName, String password);
    public void checkIfUserExists(User user);
    public boolean isAdministrator();
}