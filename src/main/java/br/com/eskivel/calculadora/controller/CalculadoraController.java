package br.com.eskivel.calculadora.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.eskivel.calculadora.model.Calculadora;
import br.com.eskivel.calculadora.model.OperadorCalc;
import br.com.eskivel.calculadora.repository.CalculadoraRepository;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

	@Autowired
	public CalculadoraRepository calculadoraRepository;

//	@RequestMapping("/calculos")
	@GetMapping
	public List<List<Calculadora>> calculos() {

		List<Calculadora> resultado = calculadoraRepository.findAll();
		return Arrays.asList(resultado);
	}

//	@RequestMapping("/calculadora")
	@PostMapping
	public double calculando(@RequestBody @RequestParam double n1, @RequestParam double n2,
			@RequestParam OperadorCalc operador) {
		System.out.println(n1 + n2 + "operador");

		Calculadora calc = new Calculadora();

		double resultado;

		calc.setN1(n1);
		calc.setN2(n2);
		calc.setOperador(operador);

		if (operador == OperadorCalc.SOMA) {

			resultado = n1 + n2;
			calc.setResultado(resultado);
			calculadoraRepository.save(calc);
			return n1 + n2;
		}

		if (operador == OperadorCalc.SUBTRACAO) {
			resultado = n1 - n2;
			calc.setResultado(resultado);
			calculadoraRepository.save(calc);
			return n1 - n2;

		}
		if (operador == OperadorCalc.DIVISAO) {
			resultado = n1 / n2;
			calc.setResultado(resultado);
			calculadoraRepository.save(calc);
			return n1 / n2;

		}
		if (operador == OperadorCalc.MULTIPLICACAO) {
			resultado = n1 * n2;
			calc.setResultado(resultado);
			calculadoraRepository.save(calc);
			return n1 * n2;

		}

		return 0;

	}

}
