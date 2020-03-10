package aula1003;

import static javax.swing.JOptionPane.*;

import java.awt.TrayIcon.MessageType;

public class Principal {

	public static void main(String[] args) {
		String nome = showInputDialog("informe o nome: ");
		int rm = Integer.parseInt(showInputDialog("rm"));

		
		Aluno aluno = new Aluno(rm, nome);
		
		showMessageDialog(null, aluno.retornarDados());
		
		int resp =showConfirmDialog(null, "deseja finalizar ?: ");
		if(resp == YES_OPTION) {
			showMessageDialog(null, "fica vai!");
		}else 
			showMessageDialog(null, "mama meu bao ","ALERTA", ERROR_MESSAGE);
		
			
	}

}
