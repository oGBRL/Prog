package aula1003;

public class Lixo {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		
		System.out.println("memoria total jvm: "+ rt.totalMemory());
		System.out.println("antes da coleta: "+ rt.freeMemory());
		Aluno aluno = null;
		for (int i =0; i<10000;i++) {
			
			aluno = new Aluno(i, "xyz");
			aluno = null;
			
			
		}
		System.out.println("memoria total jvm: "+ rt.totalMemory());
		
		rt.gc();
		System.gc();
		
		
		System.out.println("depois da coleta: "+ rt.freeMemory());
		
	}

}
