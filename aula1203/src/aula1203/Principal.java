package aula1203;
import static javax.swing.JOptionPane.*;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;


	

public class Principal {

	public static void main(String[] args) {
		int opcao;
		double real;
		double imaginario;
		Numero n1 = null;
		
		do {
			opcao = parseInt(showInputDialog(gerarMenu()));
			if (opcao <1 || opcao> 6) {
				showMessageDialog(null, "opcao invalida", "ERRO", ERROR_MESSAGE);
			}else {
				switch (opcao) {
				case 1:
					real = parseDouble(showInputDialog("digite parte real"));
					imaginario = parseDouble(showInputDialog("digite parte imaginaria"));
					 n1 = new Numero(real, imaginario);
					break;
				case 5:
					showMessageDialog(null, n1.retornaDados());
				}
			}
		}while(opcao != 6);

	}
	
	
	public static String gerarMenu() {	
		String aux = "";
		
		aux = aux + "escolha uma opçao\n";
		aux = aux + "1-gerar 1º numero complexo\n";
		aux = aux + "2-gerar 2º numero complexo\n";
		aux = aux + "3-Somar\n";
		aux = aux + "4-Subtrair\n";
		aux = aux + "5-imprimir\n";
		aux = aux + "6-finalizar\n";
		return aux;
	}
	
	
}
