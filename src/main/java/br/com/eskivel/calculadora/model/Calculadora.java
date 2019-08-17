package br.com.eskivel.calculadora.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.eskivel.calculadora.enumm.OperadorCalc;

@Entity
public class Calculadora {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private double n1;
	private double n2;
	private double resultado;
	@Enumerated(EnumType.STRING)
	private OperadorCalc operador;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public OperadorCalc getOperador() {
		return operador;
	}

	public void setOperador(OperadorCalc operador) {
		this.operador = operador;
	}
}
