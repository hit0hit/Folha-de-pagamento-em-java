package model;

import java.math.BigDecimal;
import java.time.LocalDate;
import serves.TipoCargo;

public class Pessoa {
	private String mome;
	private TipoCargo cargo;
	private LocalDate dataNacimento;
	private LocalDate dataAsmissao;
	private Integer idade;
	private BigDecimal salarioBruto;
	private BigDecimal salarioLiquido;

	public Pessoa(String mome, TipoCargo cargo, LocalDate dataNacimento, LocalDate dataAsmissao, Integer idade,
			BigDecimal salarioBruto, BigDecimal salarioLiquido) {
		super();
		this.mome = mome;
		this.cargo = cargo;
		this.dataNacimento = dataNacimento;
		this.dataAsmissao = dataAsmissao;
		this.idade = idade;
		this.salarioBruto = salarioBruto;
		this.salarioLiquido = salarioLiquido;
	}

	public String getMome() {
		return mome;
	}

	public void setMome(String mome) {
		this.mome = mome;
	}

	public TipoCargo getCargo() {
		return cargo;
	}

	public void setCargo(TipoCargo cargo) {
		this.cargo = cargo;
	}

	public LocalDate getDataNacimento() {
		return dataNacimento;
	}

	public void setDataNacimento(LocalDate dataNacimento) {
		this.dataNacimento = dataNacimento;
	}

	public LocalDate getDataAsmissao() {
		return dataAsmissao;
	}

	public void setDataAsmissao(LocalDate dataAsmissao) {
		this.dataAsmissao = dataAsmissao;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public BigDecimal getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(BigDecimal salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public BigDecimal getSalarioLiquido() {
		return salarioLiquido;
	}

	public void setSalarioLiquido(BigDecimal salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}

}
