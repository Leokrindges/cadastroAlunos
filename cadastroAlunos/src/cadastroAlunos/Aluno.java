package cadastroAlunos;

public class Aluno {
	protected String nome;
	protected String dataNascimento;
	protected Religiao religiao;
	protected EstadoCivil estadoCivil;
	protected Cidade cidade;
	//construtor defaul
	public Aluno() {
		
	}
	//construtor
	public Aluno(String nome, String dataNascimento, Religiao religiao, EstadoCivil estadoCivil, Cidade cidade) {
		super();
		this.setNome(nome);
		this.setCidade(cidade);
		this.setEstadoCivil(estadoCivil);
		this.setDataNascimento(dataNascimento);
		this.setReligiao(religiao);;
	}

	//geters e seters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Religiao getReligiao() {
		return religiao;
	}
	public void setReligiao(Religiao religiao) {
		this.religiao = religiao;
	}
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	@Override
	public String toString() {
		return "Aluno = " + getNome() + "\nData Nascimento = " + getDataNascimento() + "\nReligiao = " + getReligiao()
				+ "\nEstado Civil = " + getEstadoCivil() + "\nCidade = " + getCidade();
	}
	
	
}
