package org.example.interfaces;
import org.example.domain.User;
import java.util.UUID;

public interface IUserController {
    public void changePassword(String novaSenha);
    public void changeLogin(String novoLogin);
    public boolean answerQuestion(UUID questionID, int answer);
    public void createUser(String userName, String password);
    public void checkIfUserExists(User user);
    public boolean isAdministrator();
}