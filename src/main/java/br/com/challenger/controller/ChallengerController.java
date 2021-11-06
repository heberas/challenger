package br.com.challenger.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.challenger.model.Password;
import br.com.challenger.service.ValidatePasswordService;

@RestController
@RequestMapping("/validate/password")
public class ChallengerController {

	private final Logger logger = LoggerFactory.getLogger(ChallengerController.class);

	@Autowired
	public ValidatePasswordService validate;

	@PostMapping
	public boolean validatePassword(@RequestBody(required = true) Password password,
			HttpServletRequest request) {
		logger.info("m=validatePassword", password, request);

		return validate.isValid(password);

	}
}
