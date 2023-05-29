package cadastroAlunos;

public class EstadoCivil {

	String descricao;

	public EstadoCivil() {
		
	}
	//construtor
	public EstadoCivil(String descricao) {
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
