package AgendaPessoa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BD {

	 Map<Character, List<Pessoa>> contatos = new HashMap<Character, List<Pessoa>>();


	public  List<Pessoa> buscarPessoa(Pessoa p) {
		char c = p.getNome().charAt(0);
		if (contatos.containsKey(c)) {
			return contatos.get(c);
		}
		return null;

	}

	public  boolean adicionaPessoa(Pessoa p) {
		char c = p.getNome().charAt(0);
		if (contatos.containsKey(c)) {
			List<Pessoa> lista = contatos.get(c);
			lista.add(p);
			return true;
		} else {
			List<Pessoa> lista = new ArrayList<Pessoa>();
			lista.add(p);
			contatos.put(c, lista);
			return true;
		}
		

	}

	public  boolean removePessoa(Pessoa p) {
		char c = p.getNome().charAt(0);
		if (contatos.containsKey(c)) {
			List<Pessoa> lista = contatos.get(c);
			if (lista.contains(p)) {
				lista.remove(p);
				return true;
			}
		}
		return false;

	}

	public boolean alteraPessoaNome(Pessoa p, String novo_nome) {
		List<Pessoa> lista = buscarPessoa(p);
		if (lista.contains(p)) {
			int index = lista.indexOf(p);
			Pessoa pessoa = lista.get(index);
			lista.remove(p);
			pessoa.setNome(novo_nome);
			adicionaPessoa(p);
			return true;
		}
		return false;
		
	}
	
	
	public  boolean alteraPessoaEndereco(Pessoa p, String novo_endereco) {
		List<Pessoa> lista = buscarPessoa(p);
		if (lista.contains(p)) {
			int index = lista.indexOf(p);
			Pessoa pessoa = lista.get(index);
			pessoa.setEndereco(novo_endereco);
			return true;
		}
		return false;
		
	}
	
	public  boolean alteraPessoaTelefone(Pessoa p, String novo_telefone) {
		List<Pessoa> lista = buscarPessoa(p);
		if (lista.contains(p)) {
			int index = lista.indexOf(p);
			Pessoa pessoa = lista.get(index);
			pessoa.setTelefone(novo_telefone);
			return true;
		}
		return false;
	}
	
	
	
	

}
