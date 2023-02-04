package br.com.challenger.test.mock;

import br.com.challenger.model.Password;

import java.util.regex.Pattern;

public class ValidatePasswordServiceMocks {

    public boolean getValid(Password password) {
        String rule = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])^(?!.*(.).*\\1).*(?=.*[@#$%^&+=])(?=\\S+$).{9,}$";
        Pattern pattern = Pattern.compile(rule);
        return pattern.matcher(password.getPassword().replace(" ", "")).matches();
    }

    public Password passwordIsOk() {

        Password password = new Password();
        password.setPassword("9bpLmf@01");

        return password;
    }

    public boolean getInvalid(Password password) {
        String rule = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])^(?!.*(.).*\\1).*(?=.*[@#$%^&+=])(?=\\S+$).{9,}$";
        Pattern pattern = Pattern.compile(rule);
        return pattern.matcher(password.getPassword().replace(" ", "")).matches();
    }

    public Password passwordIsNotOk() {

        Password password = new Password();
        password.setPassword("9bpLmf@s5fs5f");

        return password;
    }
}