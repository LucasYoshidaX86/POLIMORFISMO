//Subclasse criada para aluno, herdando atributo da superclasse.
public class Aluno extends Pessoa{
	
//Constructor para inicialização do atributo.
	public Aluno(String nome) {
		super(nome);
	}
	
//Sobrescrita do método enviarEmail para Alunos.
	@Override
	public String enviarEmail(String mensagem) {
		return
				"Olá Aluno " + getNome() + "!\n\n" + "Mensagem: " + mensagem; 
	}
}
