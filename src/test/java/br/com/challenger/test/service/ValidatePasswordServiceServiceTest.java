package br.com.challenger.test.service;

import br.com.challenger.service.ValidatePasswordService;
import br.com.challenger.test.mock.ValidatePasswordServiceMocks;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
public class ValidatePasswordServiceServiceTest extends ValidatePasswordServiceMocks {

    @Spy
    @InjectMocks
    private ValidatePasswordService validatePasswordService;

    @Test
    public void whenValidatePasswordIsValid() {

        when(validatePasswordService.isValid(passwordIsOk())).thenReturn(true);

        Assert.assertEquals(validatePasswordService.isValid(passwordIsOk()), getValid(passwordIsOk()));

    }

    @Test
    public void whenValidatePasswordIsInvalid() {

        when(validatePasswordService.isValid(passwordIsNotOk())).thenReturn(false);

        Assert.assertEquals(validatePasswordService.isValid(passwordIsNotOk()), getInvalid(passwordIsNotOk()));

    }
}