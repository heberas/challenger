package br.com.challenger.test.service;

import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.challenger.service.ValidatePasswordService;
import br.com.challenger.test.mock.ValidatePasswordTest;

@RunWith(SpringJUnit4ClassRunner.class)
public class ValidatePasswordServiceTest extends ValidatePasswordTest {

	@Spy
	@InjectMocks
	private ValidatePasswordService validatePasswordService;

	@Test
	public void validatePassword() {

		when(validatePasswordService.isValid(getPasswordIsOk())).thenReturn(true);
		when(validatePasswordService.isValid(getPasswordIsNotOk())).thenReturn(false);

	}
}