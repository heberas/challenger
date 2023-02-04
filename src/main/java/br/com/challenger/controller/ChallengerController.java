package br.com.challenger.controller;

import br.com.challenger.model.Password;
import br.com.challenger.service.ValidatePasswordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/validate/password")
public class ChallengerController {

    private final Logger logger = LoggerFactory.getLogger(ChallengerController.class);

    @Autowired
    public ValidatePasswordService validate;

    @PostMapping
    public boolean validatePassword(@RequestBody Password password) {
        logger.info("m=validatePassword", password);
        return validate.isValid(password);
    }
}
