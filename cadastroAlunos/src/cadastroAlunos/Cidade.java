package cadastroAlunos;

public class Cidade {
	
	String descricao;
	String cep;
	public Cidade() {
		
	}
	//construtor
	public Cidade(String descricao, String cep) {
		super();
		this.setDescricao(descricao);
		this.setCep(cep);
	}
	//geters e seters
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	@Override
	public String toString() {
		return  descricao + "\nCEP = " + cep;
	}
	
}
