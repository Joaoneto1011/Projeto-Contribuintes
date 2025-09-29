package entities;

public class PessoaJuridica extends Contribuintes {
	
	private Integer quantidadeFuncionarios;
	
	
	public PessoaJuridica() {
		super();
	}


	public PessoaJuridica(String nome, double rendaAnual, Integer quantidadeFuncionarios) {
		super(nome, rendaAnual);
		this.quantidadeFuncionarios = quantidadeFuncionarios;
	}
	
	public Integer getQuantidadeFuncionarios() {
		
		return quantidadeFuncionarios;
	}
	
	public void setQuantidadeFuncionarios(Integer quantidadeFuncionarios) {
		
		this.quantidadeFuncionarios = quantidadeFuncionarios;
	}
	

	@Override
	public double calculoImposto() {
		
		if (quantidadeFuncionarios > 10) {
			
			return getRendaAnual() * 0.14;
		}
		
		else {
			
			return getRendaAnual() * 0.16;
		}
		
	}
	
	@Override
	public String toString() {
		return super.getNome()
				+ ": $ "
				+ String.format("%.2f", calculoImposto());
	}
	
	
}
