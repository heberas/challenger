package br.com.eskivel.calculadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.eskivel.calculadora.model.Calculadora;

public interface CalculadoraRepository extends JpaRepository<Calculadora, Long> {
//
//	Long findBycalculando(long n1, long n2, OperadorCalc operador);
}
// 