//Subclasse criada para professores, criando um novo atributo e herdando um atributo de uma superclasse.
public class Professor extends Pessoa{
	
	private String materia;

//Constructor para inicialização dos atributos.
	public Professor(String nome, String materia) {
		super(nome);
		this.materia = materia;
	}

//Encapsulamento para acessar e alterar atributos privados.
	public String getMateria() {
		return materia;
	}
	
	public void setMateria(String materia) {
		this.materia = materia;
	}

//Sobrescrita do método enviarEmail na classe Professor.
	@Override
	public String enviarEmail(String mensagem) {
		return
				"Olá Professor " + getNome() + "!\n\n" + "Mensagem: " +  mensagem;
	}

}
