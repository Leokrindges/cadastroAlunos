package cadastroAlunos;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaCadastroAlunos {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		ArrayList<Aluno> lista = new ArrayList<>();
		char controle = 's';
		do {
			//instanciando as classes
			Aluno aluno = new Aluno();
			Religiao religiao = new Religiao();
			EstadoCivil estCivil = new EstadoCivil();
			Cidade cidade = new Cidade();
			
			//inicio do cadastro
			System.out.println("Digite o nome do aluno");
			aluno.setNome(leia.next());
			System.out.println("Digite a data de nascimento");
			aluno.setDataNascimento(leia.next());
			System.out.println("Digite a religiao");
			religiao.setDescricao(leia.next());
			aluno.setReligiao(religiao);//atribuindo por paramentro o objeto religiao ao objeto aluno
			System.out.println("Digite o estado civil");
			estCivil.setDescricao(leia.next());
			aluno.setEstadoCivil(estCivil);
			System.out.println("Digite a cidade");
			cidade.setDescricao(leia.next());
			aluno.setCidade(cidade);
			System.out.println("Digite o CEP");
			cidade.setCep(leia.next());
			lista.add(aluno);		
			System.out.println("DESEJA CONTINUAR? S/N");
			controle = leia.next().charAt(0);
		}while(controle == 's' || controle =='S');

		//imprime a lista com os cadastros
		for(Aluno i: lista) {
			System.out.println(i);
		}		
	}

}
