package N1;
import N1.codigo_da_disciplina;
import N1.Notas;
public class Notas_teste {

	public static void main(String[] args) {
int opcaoCargo;


		opcaoCargo = 2;

		codigo_da_disciplina tipodisciplina = codigo_da_disciplina.values()[opcaoCargo -1];
		
		Notas notas = new Notas("kaname", 2434342, tipodisciplina, 4.5, 6.0, 9.0);
		
	System.out.println(notas.toString());
	System.out.println("\nmedia=" + notas.média_notas());
	System.out.println("\nmaior nota="+notas.getMaior_nota());
	System.out.println("menor nota="+notas.getMenor_nota()+"\n");
	System.out.println( notas.getReprovados( ));

	}

}
