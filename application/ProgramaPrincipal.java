package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuintes;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuintes> contribuinte = new ArrayList<>();
		
		System.out.print("Insira o numero de contribuintes: ");
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			System.out.println("Dados do " + i + " contribuinte:");
			
			System.out.print("Pessoa Fisica ou Juridica(F/J)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			String nome = sc.next();
			
			System.out.print("Renda anual: ");
			double rendaAnual = sc.nextDouble();

			if(ch == 'F') {
				
				System.out.print("Gastos com Saude: ");
				double gastosComSaude = sc.nextDouble();
				
				PessoaFisica individual = new PessoaFisica(nome, rendaAnual, gastosComSaude);
				
				contribuinte.add(individual);
			}
			
			else {
				
				System.out.print("Quantidade de funcionarios: ");
				int quantidadeFuncionarios = sc.nextInt();
				
				PessoaJuridica empresa = new PessoaJuridica(nome, rendaAnual, quantidadeFuncionarios);
				
				contribuinte.add(empresa);
			}
			
		}
		System.out.println();
		
		System.out.println("IMPOSTOS PAGOS: ");
		
		double soma = 0.0;
		
		for (Contribuintes contribuintes : contribuinte) {
			
			System.out.println(contribuintes.toString());
			soma += contribuintes.calculoImposto();
			
		}
		
		System.out.println();
		
		System.out.printf("TOTAL DE IMPOSTOS: $ %.2f", soma);
	
		
		sc.close();
		
	}

}