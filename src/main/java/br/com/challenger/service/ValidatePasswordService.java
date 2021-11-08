package br.com.challenger.service;

import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import br.com.challenger.model.Password;

@Service
public class ValidatePasswordService {

	public boolean isValid(Password password) {

		String rule = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])^(?!.*(.).*\\1).*(?=.*[@#$%^&+=])(?=\\S+$).{9,}$";

		Pattern pattern = Pattern.compile(rule);
		
		return pattern.matcher(password.getPassword().replace(" ", "")).matches();
	}
}
