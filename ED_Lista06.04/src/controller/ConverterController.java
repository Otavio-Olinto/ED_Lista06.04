package controller;

import otavioolinto.pilhas.PilhaStr;

public class ConverterController {
	
	
	public ConverterController() {
		super();
	}
	
	// Criando o StringBuffer para concatenar as divisões 
	StringBuffer buffer = new StringBuffer();
	
	// Instanciando os metodos da classe PilhasStr
	PilhaStr metodo = new PilhaStr();
	
	public String decToBin(int num) {
		
		String binario="";
		
		if(num<2) {
			
			metodo.push(Integer.toString(num));
			
		}else {
			
			metodo.push(Integer.toString(num%2));
			decToBin(num/2);
		}
		
		try {
			buffer.append(metodo.pop());
		}catch(Exception exc) {
			System.out.println("\n"+exc.getMessage());
		}
		
		
		binario = buffer.toString();
		
		return binario;
	}

}
