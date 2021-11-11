package MediaAlunos;

public class FilaNomes {
	
	public String[] nomes;
	public int inicio;
	public int fim;
	public int total;
	
	//metodo construtor
	public FilaNomes() {
		
		nomes = new String[5];
		inicio = fim = total = 0;
	}
	
	public void inserir(String nome) {
		nomes[fim]  = nome;
		fim++;
						
		if(fim == nomes.length) {
			fim = 0;
		}
						
		total++;
						
	} // Fim public Void
	
	public String retirar() {
		String nome = nomes[inicio];
		inicio++;
		total--;
		return nome;
	}
	
	public void mostrar() {
		for(int i = inicio; i < 5; i++) {
			System.out.print(nomes[i] + "");
		}
		
		System.out.println();
	}
	
	public boolean vazia() {
		return total == 0;
	}
	
	public boolean cheia() {
		return total == nomes.length;
	}
}