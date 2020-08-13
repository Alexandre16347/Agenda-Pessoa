package AgendaPessoa;

public abstract class Pessoa {
	protected String nome;
	protected String telefone;
	protected String endereco;
	protected Documento num;
	protected Documento documento;
	protected TipoPessoa tipo;

	
	public Documento getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num.verifica(num);
	}
	
	

	
	public TipoPessoa getTipo() {
		return tipo;
	}
	public void setTipo(TipoPessoa tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Documento getDocumento() {
		return documento;
	}
	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
	
	
	
	
}
