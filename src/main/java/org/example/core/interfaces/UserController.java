package org.example.core.interfaces;

import java.util.UUID;

public interface UserController {
    void changePassword(String novaSenha);
    void changeLogin(String novoLogin);
    boolean answerQuestion(UUID questionID, int answer);
}
