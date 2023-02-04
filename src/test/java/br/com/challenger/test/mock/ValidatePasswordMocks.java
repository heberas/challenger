package br.com.challenger.test.mock;

import br.com.challenger.model.Password;

public class ValidatePasswordMocks {

    public Password getPasswordIsOk() {

        Password password = new Password();
        password.setPassword("9bpLmf@01");

        return password;
    }

    public Password getPasswordIsNotOk() {

        Password password = new Password();
        password.setPassword("9bpLmf@s5fs5f");

        return password;
    }
}