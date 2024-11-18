package main.java.by.rublevskaya.model;

import main.java.by.rublevskaya.model.exception.WrongLoginException;
import main.java.by.rublevskaya.model.exception.WrongPasswordException;
import main.java.by.rublevskaya.model.user.User;
import main.java.by.rublevskaya.model.validation.Validator;

public class Runner {
    public static void main(String[] args) {
        User[] users = {
                new User("Katusha", "Kater1", "Kater1"), //сработает
                new User("Andrey", "Andre22", "Andre1"),//не сработает, не совпадают
                new User("Andrew", "6578", "6578"),// сработает
                new User("Ivan", "Iv@n", "Iv@n2511") // не сработает, не содержит хотя б 1 цифру
        };

        for (User user : users) {
            try {
                boolean isValid = Validator.validate(user.getLogin(), user.getPassword(), user.getConfirmPassword());
                System.out.println("Validation result for user " + user.getLogin() + ": " + isValid);
            } catch (WrongLoginException | WrongPasswordException e) {
                System.out.println("Validation failed for user " + user.getLogin() + ": " + e.getMessage());
            }
        }
    }
}