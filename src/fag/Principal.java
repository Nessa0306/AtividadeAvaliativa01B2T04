package fag;

import java.util.Scanner;

import objeto.Bicicleta;
import objeto.ContaBancaria;
import objeto.ContaLuz;
import objeto.Filme;
import objeto.Funcionario;
import objeto.Musica;
import objeto.Pessoa;
import objeto.ProdutoEstoque;
import objeto.Retangulo;
import objeto.Temperatura;

public class Principal {
	public static void main(String[] args) {
		//atividadeUm();
		//atividadeDois();
		//atividadeTres();
		//atividadeQuatro();
		//atividadeCinco();
		//atividadeSeis();
		//atividadeSete();
		//atividadeOito();
		//atividadeNove();
		//atividadeDez();
	}
	
	public static void atividadeUm() {
		ContaBancaria contaUm = new ContaBancaria("Joao Otavio", 0);
		System.out.println("Saldo R$ " +contaUm.getSaldo());
		contaUm.depositar(1750);
		System.out.println("Saldo R$ " +contaUm.getSaldo());
		contaUm.sacar(300);
		System.out.println("Saldo R$ " +contaUm.getSaldo());
		
	}
	public static void atividadeDois() {
		Filme filmeUm = new Filme("Invocação do mal 2", 5);
		Filme filmeDois = new Filme("Liga da Justiça", 5);
		
		System.out.println(filmeUm.exibir());
		System.out.println(filmeDois.exibir());
		
	}
	public static void atividadeTres() {
		Funcionario fUm = new Funcionario("Matheus",5202);
		Funcionario fDois = new Funcionario("Bruno",4500);
		
		System.out.println("Funcionario: "+fUm.getNome()+" Salario: "+ fUm.getSalario());
		System.out.println("Funcionario: "+fDois.getNome()+" Salario: "+ fDois.getSalario());
		
		fUm.aumentarSalario(10);
		fDois.aumentarSalario(10);
		System.out.println("Funcionario: "+fUm.getNome()+" Salario: "+ fUm.getSalario());
		System.out.println("Funcionario: "+fDois.getNome()+" Salario: "+ fDois.getSalario());		
		
	}
	public static void atividadeQuatro() {
		Retangulo retanguloUm = new Retangulo(50,50);
		
		System.out.println("Area: "+retanguloUm.area());
		System.out.println("Perimetro: "+retanguloUm.perimetro());
		
	}
	public static void atividadeCinco() {
		Musica musicaUm = new Musica ("Sexta Feira 2 Tudo certo - MC ryan sp", 250);
		Musica musicaDois = new Musica ("Mano Pepa- DJ Emige", 210);
		
		System.out.println("Titulo: "+musicaUm.getTitulo()+ "Duração: "+musicaUm.formatarDuracao());
		System.out.println("Titulo: "+musicaDois.getTitulo()+ "Duração: "+musicaDois.formatarDuracao());
		
	}
	public static void atividadeSeis() {
		Pessoa pessoaUm = new Pessoa ("Joao", 71, 1.80);
		System.out.println("Nome: "+pessoaUm.getNome()+" IMC: "+ pessoaUm.calcularIMC() +" Classificação: "+ pessoaUm.classificacaoIMC());
		
	}
	public static void atividadeSete() {
		ContaLuz contaUm = new ContaLuz(250, 0.55);
		
		System.out.println("Valor da Conta de Luz R$ "+ contaUm.calculorValor());
	}
	public static void atividadeOito() {
		Scanner scanner = new Scanner (System.in);
		Bicicleta bikeUm = new Bicicleta(0, 50.50);
		
		System.out.println("Insira a Quantidade de horas? ");
		bikeUm.setHoras(scanner.nextInt());
		
		
		System.out.println("Valor do aluguel R$ "+ bikeUm.calcularValor());
		
	}
	public static void atividadeNove() {
		ProdutoEstoque produtoUm = new ProdutoEstoque("Televisão", 0);
		
		System.out.println("Saldo da "+ produtoUm.getNome()+" é "+ produtoUm.getQuantidade());
		produtoUm.adicionarEstoque(10);
		System.out.println("Saldo da "+ produtoUm.getNome()+" é "+ produtoUm.getQuantidade());
		produtoUm.removerEstoque(3);
		System.out.println("Saldo da "+ produtoUm.getNome()+" é "+ produtoUm.getQuantidade());
		
	}
	public static void atividadeDez() {
		Scanner scanner = new Scanner(System.in);
		Temperatura tempUm = new Temperatura();
		System.out.println("Insira A temperatura:");
		tempUm.setCelsius(scanner.nextDouble());
		System.out.println("A temperatura é "+ tempUm.getCelsius()+"C");
		System.out.println("Convertendo para Fahrenheit:"+ tempUm.paraFahrenhiet()+"F");
		System.out.println("Convertendo para Kelvin:"+ tempUm.paraKelvin()+"K");
		
	}
	
}