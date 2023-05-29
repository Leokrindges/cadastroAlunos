package cadastroAlunos;

public class Religiao{

	String descricao;
	//construtores
	public Religiao() {
		
	}	
	public Religiao(String descricao) {
		super();
		this.setDescricao(descricao);
	}
	//geters e seters
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	//sobreescrita do metoto toString
	public String toString() {
		return descricao;
	}
	
}
