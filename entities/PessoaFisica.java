package entities;

public class PessoaFisica extends Contribuintes {
	
	private double gastosComSaude;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, double rendaAnual, double gastosComSaude) {
		super(nome, rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}

	public double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}
	
	@Override
	public double calculoImposto() {
		
		double taxa = (getRendaAnual() < 20000.00) ? 0.15 : 0.25;
		
		double impostoBase = getRendaAnual() * taxa;
		
		if (gastosComSaude > 0.0) {
			
			impostoBase -= gastosComSaude * 0.5;
		}
		
		return impostoBase;
	}

	@Override
	public String toString() {
		return super.getNome()
				+ ": $ "
				+ String.format("%.2f", calculoImposto());
	}
	
	

}
