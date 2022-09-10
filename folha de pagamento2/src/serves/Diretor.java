package serves;

import java.math.BigDecimal;

import model.Pessoa;

public class Diretor implements CalculaSalario {

	
		public Pessoa calcularSalarioLiquido(Pessoa pessoa) {
			
			pessoa.setSalarioLiquido(pessoa.getSalarioBruto()
					.add(new BigDecimal("250.00"))
					.subtract(new BigDecimal("60.00")));
		return pessoa;
	}

}
