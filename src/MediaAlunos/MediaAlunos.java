package MediaAlunos;

import java.util.Scanner;

public class MediaAlunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		FilaNomes fila = new FilaNomes();
		String nome;
		
		System.out.println("Digite os Nomes dos alunos a serem avaliados em ordem: ");
		
		for(int i = 0; i < 3; i ++) {
			nome = teclado.nextLine();
			fila.inserir(nome);
		}
		
		while(!fila.vazia()) {
			nome = fila.retirar();
			System.out.println(nome + "");
		}
		
		int nota1, nota2, nota3;
		int media;
		int i;
		int contAluno = 0;
		
		for(i = 0; i < 3; i++) {
			contAluno++;
			
			//Primeira nota
			System.out.println("Aluno" + contAluno + ", Digite sua primeira nota: ");
			nota1 = teclado.nextInt();
			
			//segunda nota
			System.out.println("Aluno" + contAluno + ", Digite sua segunda nota: ");
			nota2 = teclado.nextInt();
			
			//terceira nota
			System.out.println("Aluno" + contAluno + ", Digite sua terceira nota: ");
			nota3 = teclado.nextInt();
			
			//calcular a media dos alunos
			media = (nota1 + nota2 + nota3)/3;
			System.out.println("a media do aluno " + contAluno + " e: " + media);
			
			if((media >= 0) &&(media <4) ) {
				System.out.println("reprovou");
			}else if(media <= 5) {
				System.out.println("reprovou");
			}else if(media >= 6){
				System.out.println("aprovado");	
			}	
		}
	}

}
