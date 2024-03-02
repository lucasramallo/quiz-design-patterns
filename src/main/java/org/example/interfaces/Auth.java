package org.example.interfaces;

public interface Auth {
    public boolean checkLogin();
    public boolean checkPassword();
    public boolean authAccount(String login, String password);
    public void createAccount(String Login, String password);
}
