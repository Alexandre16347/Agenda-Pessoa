package AgendaPessoa;
public class CPF extends Documento {
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return imprimeCPF();
	}

	public CPF(String cpf) {
		super.verifica(cpf);
	}
}
