//Superclasse criada para conter atributos em comum para outras classes. 
public class Pessoa {
	private String nome;

//Constructor para inicialização do atributo criado.
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
//Encapsulamento para acessar e alterar atributos privados.
	public String getNome() {
		return nome;
	}
		
	public void setNome(String nome) {
		this.nome = nome;
	}
	
//Método que sera sobrescrito nas subclasses. 
	public String enviarEmail(String mensagem) {
		return
				"Olá" + nome + "!\n\n" + "Mensagem: " + mensagem;
	}
	
}
