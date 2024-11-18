package main.java.by.rublevskaya.model.validation;

import main.java.by.rublevskaya.model.exception.WrongLoginException;
import main.java.by.rublevskaya.model.exception.WrongPasswordException;

public class Validator {
    public static boolean validate(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        validateLogin(login);
        validatePassword(password, confirmPassword);
        return true;
    }

    private static void validateLogin(String login) throws WrongLoginException {
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Login must be less than 20 characters and not contain spaces");
        }
    }

    private static void validatePassword(String password, String confirmPassword)
            throws WrongPasswordException {
        if (password.length() >= 20 || containsSpace(password.toCharArray()) || !containsNumber(password.toCharArray())) {
            throw new WrongPasswordException("Password must be less than 20 characters, not contain spaces, and contain at least one number");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password and confirmPassword must match");
        }
    }

    private static boolean containsNumber(char[] chars) {
        for (char c : chars) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean containsSpace(char[] chars) {
        for (char c : chars) {
            if (Character.isWhitespace(c)) {
                return true;
            }
        }
        return false;
    }
}
