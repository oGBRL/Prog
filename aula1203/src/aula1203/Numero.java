package aula1203;

public class Numero {

	double real;
	double imaginario;
	
	//Numero numero = new Numero();
	
	public Numero(double valorR, double valorI) {
		real = valorR;
		imaginario = valorI;
	}
	
	public Numero(double valorI) {
		real = 0;
		imaginario = valorI;
	}
	
	public String retornaDados() {
		String aux = "z ="+real+"+"+imaginario+"i";
		
		return aux;
	}
}
