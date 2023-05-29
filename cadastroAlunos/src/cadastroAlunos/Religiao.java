package cadastroAlunos;

public class Religiao{

	String descricao;
	
	public Religiao() {
		
	}
	
	//construtor
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
	public String toString() {
		return descricao;
	}
	
}
