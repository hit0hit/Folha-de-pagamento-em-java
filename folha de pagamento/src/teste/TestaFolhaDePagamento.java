package teste;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.zip.InflaterInputStream;

import model.Pessoa;
import serves.CalculaSalario;
import serves.TipoCargo;

public class TestaFolhaDePagamento {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			System.out.println("informe o salario bruto:  ");
			BigDecimal salarioBruto = input.nextBigDecimal();
			
			System.out.println("informe o  cargo: \n 1= CORDENADOR\n 2= DIRETOR\n 3= PROFESSOR\n");
			int opcaoCargo = input.nextInt();
			TipoCargo tipoCargo = TipoCargo.values()[opcaoCargo -1];
			
			CalculaSalario calculaSalario =new CalculaSalario(tipoCargo);
			Pessoa pessoa =new Pessoa(
					"kaname",
					tipoCargo,
					LocalDate.of(2000, 1, 11),
					LocalDate.now(),
					22,
					salarioBruto,
					BigDecimal.ZERO);
			
			Pessoa pessoaPagar = calculaSalario.calcularSalarioLiquido(pessoa);
			
			System.out.printf("o salário líquido do "
					.concat(pessoaPagar.getMome())
					.concat(" com o cargo: ")
					.concat(pessoaPagar.getCargo().name())
					.concat(" è R$%.2f"),
					pessoaPagar.getSalarioLiquido());
			
			
		}

	}

}
