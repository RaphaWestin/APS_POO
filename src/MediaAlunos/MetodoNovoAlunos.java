package MediaAlunos;

import java.util.ArrayList;
import java.util.Scanner;

public class MetodoNovoAlunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		String aluno;
		int ocp;
		int aprovado = 0;
		int reprovado = 0;
		float n1,n2, media, smclasse=0, mediaclasse=0;
		
		ArrayList<String> alunos = new ArrayList<>();
		
		do {
			System.out.println("informe o nome do aluno: ");
			aluno = leia.nextLine();
			alunos.add(aluno);
			
			System.out.println("informe a nota N1: ");
			n1 = leia.nextFloat();
			
			
			System.out.println("informe a nota N2: ");
			n2 = leia.nextFloat();
			
			
			media = (n1 + n2)/2;
			smclasse += media;
			
			System.out.printf("a media do aluno" + aluno + "foi:%.1f %n ", + media);
			
			if(media >= 6) {
				System.out.println(aluno + " esta aprovado");
				aprovado = aprovado + 1;
			}else if (media < 6) {
				System.out.println(aluno + " está reprovado.");
				reprovado = reprovado + 1;
			} else {
				System.out.println(aluno + " está de prova final.");

			}
			
			System.out.println("Deseja continuar? (1- Sim; 0-Não): ");
			ocp = leia.nextInt();

			leia.nextLine();
			
		}while(ocp == 1);
		
		alunos.size();
		
		mediaclasse = (smclasse / alunos.size());
		
		System.out.println("Total de aprovados: " + aprovado);
		System.out.println("Total de reprovados: " + reprovado);
		System.out.printf("Média da classe: %.1f %n", +mediaclasse);
		System.out.println("Total de alunos: " + alunos.size());
	}

}
