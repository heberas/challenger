package br.com.eskivel.calculadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.eskivel.calculadora.model.Calculadora;
import br.com.eskivel.calculadora.service.CalculadoraService;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

	@Autowired
	public CalculadoraService calculadoraService;

	@PostMapping
	public double calculando(@RequestBody Calculadora calculadora) {

		return calculadoraService.CalcServ(calculadora);

	}

}
