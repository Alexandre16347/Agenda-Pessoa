package AgendaPessoa;

public class Main {

	public static void main(String[] args) {

		Pessoa p1 = new PessoaFisica("Goldofredo", "40028922", "Rua das garibaldas", "08268715340");
		BD BD = new BD();

		BD.adicionaPessoa(p1);
		System.out.println(p1);

		Pessoa p2 = new PessoaJuridica("Funerária Santa Luzia", "90041011", "Rua das maloquinhas", "13590585000199");
		BD.adicionaPessoa(p2);
		System.out.println(p2);

		Pessoa p3 = new PessoaFisica("Goldofredo", "40028922", "Rua das garibaldas", "08268715340");
		BD.adicionaPessoa(p3);
		System.out.println(p3);
		
		System.out.println(BD.removePessoa(p2));
		
		System.out.println(BD.alteraPessoaNome(p1, "Afonso sempai"));
		System.out.println(BD.alteraPessoaEndereco(p1, "Rua das amoebas"));
		System.out.println(BD.alteraPessoaTelefone(p1, "90041011"));
		System.out.println(p1);
		
		

	}

}
