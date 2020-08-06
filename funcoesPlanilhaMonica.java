package funcoesPlanilha;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale; 

public class funcoesPlanilhaMonica {
	
	//Codigo desenvolvido para a Atividade de Funcões da disciplina de Informatica Aplicada
	//O Sistema permite realizar 4 funções com valores reais, sendo elas: soma, maxima, minimo e media. 

	static ArrayList<Double> valores = new ArrayList<Double>();

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.ENGLISH);
		int quantidade = 0; 
		int controleMenuFuncoes = -1;
		Double valor = 0.0;
		
		System.out.println("Qual das funções você deseja realizar? \n1 - Soma\n2 - Máxima\n"
				+ "3 - Mínimo\n4 - Média\nDigite o número que corresponde a função desejada:");
		controleMenuFuncoes = ler.nextInt();
		
		System.out.println("Informe o com quantos valores você deseja trabalhar: ");
		quantidade = ler.nextInt();
		
		for (int i = 0; i < quantidade; i++) {
			
			System.out.println("Informe o valor de posição: "+i);
			valor = ler.nextDouble();
			valores.add(valor);
		}
		
		if (controleMenuFuncoes == 1) {
			calcularSoma();			
		}

		if (controleMenuFuncoes == 2) {
			calcularMaxima();
		}

		if (controleMenuFuncoes == 3) {
			calcularMinimo();	
		}
		
		if (controleMenuFuncoes == 4) {
			calcularMedia();
		}

	}
	
	public static void calcularSoma() {
		
		Double soma = 0.0;
		for (int i = 0; i < valores.size(); i++) {
			soma += valores.get(i);
		}
		System.out.println("O resultado da soma é: "+soma);
	
	}
	
	public static void calcularMaxima() {
		
		Double maxima = 0.0;
		for (int i = 0; i < valores.size(); i++) {
			if (valores.get(i) > maxima) {
				maxima = valores.get(i);
			}
		}
		System.out.println("O resultado da máxima é: "+maxima);
	}
	
	public static void calcularMinimo() {
		
		Double minimo = 100000000000000000000000000000000000.0;
		for (int i =0; i < valores.size(); i++) {
			if (valores.get(i) < minimo) {
				minimo = valores.get(i);
			}
		}
		System.out.println("O resultado do mínimo é: "+minimo);
	}
	
	public static void calcularMedia() {
		
		Double soma = 0.0;
		Double media = 0.0;
		for (int i = 0; i < valores.size(); i++) {
			soma += valores.get(i);
			media = soma / valores.size();
		}
		System.out.println("O resultado da média é: "+media);
	}
	
}
