package br.com.challenger.test.entity;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.challenger.model.Password;

@ActiveProfiles("local")
@RunWith(SpringJUnit4ClassRunner.class)
public class PasswordEntityTest {

	@Test
	public void testPasswordEntity() {

		Password password = new Password();
		password.setPassword("9bp Lmf@01".replace(" ", ""));

		Assert.assertEquals(password.getPassword(), "9bpLmf@01");
	}
}