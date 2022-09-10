package serves;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import model.Pessoa;

public class ImpressaoHolerite implements CalculaSalario {
	private CalculaSalario calculaSalario;
	
	public ImpressaoHolerite(CalculaSalario calculaSalario) {
		this.calculaSalario = calculaSalario;
	}
	
	@Override
	public Pessoa calcularSalarioLiquido(Pessoa pessoa) {
		Pessoa pessoaCalculada = calculaSalario.calcularSalarioLiquido(pessoa);
		try(PrintStream write = new PrintStream(new FileOutputStream("holerite.txt", true))){
			write.println("Nome" + pessoaCalculada.getNome()+
					"cargo" + pessoaCalculada.getCargo()+
					"Salário" + pessoaCalculada.getSalarioBruto()+
					"Salário liquiro" + pessoaCalculada.getSalarioLiquido());
			
			
			
		} catch (FileNotFoundException el) {
			el.printStackTrace();
		}
		return pessoaCalculada;
	}

}
