package br.com.challenger.test.mock;

import org.mockito.Mock;

import br.com.challenger.model.Password;
import br.com.challenger.test.entity.PasswordEntityTest;

public class ValidatePasswordTest {

	@Mock
	PasswordEntityTest password;

	public PasswordEntityTest passwordEntityTest() {
		return password;
	}

	public Password getPasswordIsOk() {

		Password password = new Password();
		password.setPassword("9bp Lmf@01".replace(" ", ""));

		return password;
	}
	
	public Password getPasswordIsNotOk() {

		Password password = new Password();
		password.setPassword("9bp Lmf@011".replace(" ", ""));

		return password;
	}
}