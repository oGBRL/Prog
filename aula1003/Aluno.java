package aula1003;

public class Aluno {
	int rm;
	String nome;
	
	public Aluno(int rm, String nome) {
		this.rm = rm;
		this.nome = nome;
	}
	
	public String retornarDados() {
		return rm+"\n"+nome;
	}
}
