package AgendaPessoa;

public class PessoaFisica extends Pessoa {
	
	public PessoaFisica(String nome, String telefone, String endereco, String num) {
		super.num = new CPF(num);
		super.setNome(nome);
		super.setTelefone(telefone);
		super.setEndereco(endereco);
		super.setTipo(TipoPessoa.Pessoa_f�sica);
		super.setNum(num);
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + getNome() + "\nEndere�o: " + getEndereco() + "\nTelefone: " + getTelefone() + "\nCPF: " + getNum()+"\n";
	}
}
         