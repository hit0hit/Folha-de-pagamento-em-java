package serves;

import java.math.BigDecimal;

import model.Pessoa;

public class Cordenador implements CalculaSalario{
	public Pessoa calcularSalarioLiquido(Pessoa pessoa) {
		
			pessoa.setSalarioLiquido(pessoa.getSalarioBruto()
					.add(new BigDecimal("100.00"))
					.subtract(new BigDecimal("50.00")));
		return pessoa;
	
}}
