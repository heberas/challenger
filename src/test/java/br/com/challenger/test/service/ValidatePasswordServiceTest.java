package br.com.challenger.test.service;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.challenger.service.ValidatePasswordService;
import br.com.challenger.test.mock.ValidatePasswordMocks;

@RunWith(SpringJUnit4ClassRunner.class)
public class ValidatePasswordServiceTest extends ValidatePasswordMocks {

	@Spy
	@InjectMocks
	private ValidatePasswordService validatePasswordService;

	@Test
	public void whenValidatePasswordIsValid() {

		when(validatePasswordService.isValid(getPasswordIsOk())).thenReturn(true);

		Assert.assertEquals(getPasswordIsOk().getPassword(), "9bpLmf@01");

	}

	@Test
	public void whenValidatePasswordIsNotValid() {

		when(validatePasswordService.isValid(getPasswordIsNotOk())).thenReturn(false);

		Assert.assertEquals(getPasswordIsNotOk().getPassword(), "9bpLmf@s5fs5f");

	}
}