package br.com.eskivel.calculadora.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.eskivel.calculadora.enumm.OperadorCalc;
import br.com.eskivel.calculadora.model.Calculadora;
import br.com.eskivel.calculadora.repository.CalculadoraRepository;

@Service
public class CalculadoraService {

	@Autowired
	public CalculadoraRepository calculadoraRepository;

	public double CalcServ(Calculadora calculadora) {
		
		double resultado = 0;
		
		calculadora.setN1(calculadora.getN1());
		calculadora.setN2(calculadora.getN2());
		calculadora.setOperador(calculadora.getOperador());

		if (calculadora.getOperador() == OperadorCalc.SOMA) {
			resultado = calculadora.getN1() + calculadora.getN2();
		
		}

		if (calculadora.getOperador() == OperadorCalc.SUBTRACAO) {
			resultado = calculadora.getN1() - calculadora.getN2();
			
		}
		if (calculadora.getOperador() == OperadorCalc.DIVISAO) {
			resultado = calculadora.getN1() / calculadora.getN2();
		
		}
		if (calculadora.getOperador() == OperadorCalc.MULTIPLICACAO) {
			resultado = calculadora.getN1() * calculadora.getN2();
			
		}
		
		calculadora.setResultado(resultado);
		calculadoraRepository.save(calculadora);
		return resultado;
		//

	}
}
