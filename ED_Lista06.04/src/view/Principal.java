package view;

import controller.ConverterController;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Instanciando os métodos da classe ConveerterController
		ConverterController metodo = new ConverterController();
		
		// Criando o método de leitura com scanner
		Scanner ler = new Scanner(System.in);
		
		int num;
		
		do {
			
			System.out.print("Digite o número que deseja converter para binário: ");
			num = Integer.parseInt(ler.nextLine());
			
			if(num<0 || num>1000) System.out.println("Apenas aceito números de 0 a 1000. Tente novamente\n\n");
			
		}while(num<0 || num>1000);	
		
		System.out.println("\n\nO número "+num+" em binário é: "+metodo.decToBin(num));
		
		ler.close();
	}

}
