package AgendaPessoa;

public class PessoaJuridica extends Pessoa{

	public PessoaJuridica(String nome, String telefone, String endereco, String num) {
		super.num = new CNPJ(num);
		super.setNome(nome);
		super.setTelefone(telefone);
		super.setEndereco(endereco);
		super.setTipo(TipoPessoa.Pessoa_Jur�dica);
		super.setNum(num);
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + getNome() + "\nEndere�o: " + getEndereco() + "\nTelefone: " + getTelefone() + "\nCNPJ: " + getNum() + "\n";
	}
}
