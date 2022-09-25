package N1;
import N1.codigo_da_disciplina;
public class Notas {

	private String nome;
	private int matricula;
	private codigo_da_disciplina cargo;
	private Double nota1,nota2,nota3;
	private Double maior_nota, menor_nota,média_notas;
	private String reprovados;
	
	
	
	

	public Notas(String nome, int matricula, codigo_da_disciplina cargo, Double nota1, Double nota2, Double nota3) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.cargo = cargo;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public codigo_da_disciplina getCargo() {
		return cargo;
	}


	public void setCargo(codigo_da_disciplina cargo) {
		this.cargo = cargo;
	}


	public Double getNota1() {
		return nota1;
	}
	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}
	public Double getNota2() {
		return nota2;
	}
	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}
	public Double getNota3() {
		return nota3;
	}
	public void setNota3(Double nota3) {
		this.nota3 = nota3;
	}
	public Double getMaior_nota() {
		maior_nota = Math.max(nota2,Math.max(nota3,nota1));
		return maior_nota;
	}
	public Double getMenor_nota() {
		 menor_nota= Math.min(nota2,Math.min(nota3,nota1));
		return menor_nota;
	}
	public String getReprovados() {
		Double media = (nota1 + nota2 + nota3)/3;
		if(media <=5){ reprovados="reprovado";}else{reprovados="aprovado";};
		return reprovados;
	}
	public Double média_notas(){
		Double media = (nota1 + nota2 + nota3)/3;

		return media;
	}


	


	@Override
	public String toString() {
		return "Notas:\n nome=" + nome +
				", \n matricula=" + matricula + 
				", \n cargo=" + cargo + 
				", \n nota1=" + nota1 + 
				", \n nota2=" + nota2 + 
				", \n nota3=" + nota3;
	}
	
	
	
}
