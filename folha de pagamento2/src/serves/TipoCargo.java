package serves;

public enum TipoCargo {
	CORDENADOR {
		@Override
		public CalculaSalario getCargo() {
			return new ImpressaoHolerite(new Cordenador());
		}
	},
	DIRETOR {
		@Override
		public CalculaSalario getCargo() {
		return new ImpressaoHolerite(new Diretor());
		}
	},
	PROFESSOR {
		@Override
		public CalculaSalario getCargo() {
			// TODO Auto-generated method stub
			return null;
		}
	};
	
	public abstract CalculaSalario getCargo();
}
