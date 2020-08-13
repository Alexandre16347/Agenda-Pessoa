package AgendaPessoa;
public class CNPJ extends Documento{
	
	private String numCNPJ;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return imprimeCNPJ();
	}
	
	public String getNumCNPJ() {
		return numCNPJ;
	}

	public void setNumCNPJ(String cnpj) {
		if (super.verifica(cnpj)) {
			this.numCNPJ = super.imprimeCNPJ();
		}
		else {
			System.err.println("CNPJ INVÁLIDO");
		}
		
		
	}

	public CNPJ(String cnpj) {
		setNumCNPJ(cnpj);
	}
	
	
}
