import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
/*Entrada dos dados através do Scanner, onde uma pergunta é feita e o usuário digita. Logo após o recebimento do nome e email, o método "if e else" 
separa o usuário entre o tipo de pessoa, sendo aluno ou Professor
*/
		Scanner entrada = new Scanner(System.in); 
				
		System.out.println("Digite seu nome: ");
			String nome = entrada.nextLine();
				
		System.out.println("Digite seu email: ");
			String email = entrada.nextLine();
				
		System.out.println("Você é um aluno ou professor? \n Digite 'A' para aluno ou 'P' para professor: ");
			String pessoaTipo = entrada.nextLine(); 
					
			Pessoa pessoa;
			if(pessoaTipo.equals("P")) {
				System.out.println("Digite a matéria em que você leciona: ");
					String materia = entrada.nextLine();
					pessoa = new Professor(nome, materia);
			}
			else if(pessoaTipo.equals("A")) {
				pessoa = new Aluno(nome);
			}
			else {
				System.out.println("Erro!! Tipo de pessoa inválido!!");
				return;
			}

//Recebimento da mensagem que o usuário deseja enviar.
		System.out.println("Digite a mensagem desejada: ");
			String mensagem = entrada.nextLine();
					
//Criando instância para exibição dos resultados.
		String emailPronto = pessoa.enviarEmail(mensagem);
			System.out.println("\n--- Email Enviado ---");
			System.out.println(emailPronto);
				
					
			entrada.close();

	}

}
