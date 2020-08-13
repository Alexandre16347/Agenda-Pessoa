package AgendaPessoa;

import java.util.InputMismatchException;

public abstract class Documento {

	private String numero;

	public boolean verifica(String numero) {

		// considera-se erro CPF's formados por uma sequencia de numeros iguais
		if (numero.equals("00000000000") || numero.equals("11111111111") || numero.equals("22222222222")
				|| numero.equals("33333333333") || numero.equals("44444444444") || numero.equals("55555555555")
				|| numero.equals("66666666666") || numero.equals("77777777777") || numero.equals("88888888888")
				|| numero.equals("99999999999"))
			return (false);
		

		// considera-se erro CNPJ's formados por uma sequencia de numeros iguais
		if (numero.equals("00000000000000") || numero.equals("11111111111111") || numero.equals("22222222222222")
				|| numero.equals("33333333333333") || numero.equals("44444444444444") || numero.equals("55555555555555")
				|| numero.equals("66666666666666") || numero.equals("77777777777777") || numero.equals("88888888888888")
				|| numero.equals("99999999999999") || (numero.length() != 14))
			return (false);

		int sm, i, r, num, peso;

		// "try" - protege o codigo para eventuais erros de conversao de tipo (int)
		try {
			//Condicao para ser um CPF
			if (numero.length() == 11) {
				
				char dig10, dig11;
				
				// Calculo do 1o. Digito Verificador
				sm = 0;
				peso = 10;
				for (i = 0; i < 9; i++) {
					// converte o i-esimo caractere do CPF em um numero:
					// por exemplo, transforma o caractere '0' no inteiro 0
					// (48 eh a posicao de '0' na tabela ASCII)
					num = (int) (numero.charAt(i) - 48);
					sm = sm + (num * peso);
					peso = peso - 1;
				}

				r = 11 - (sm % 11);
				if ((r == 10) || (r == 11))
					dig10 = '0';
				else
					dig10 = (char) (r + 48); // converte no respectivo caractere numerico

				// Calculo do 2o. Digito Verificador
				sm = 0;
				peso = 11;
				for (i = 0; i < 10; i++) {
					num = (int) (numero.charAt(i) - 48);
					sm = sm + (num * peso);
					peso = peso - 1;
				}

				r = 11 - (sm % 11);
				if ((r == 10) || (r == 11))
					dig11 = '0';
				else
					dig11 = (char) (r + 48);

				// Verifica se os digitos calculados conferem com os digitos informados.
				if ((dig10 == numero.charAt(9)) && (dig11 == numero.charAt(10))) {
					setNumero(numero);
					return (true);
				} else
					return (false);
			}

			//Condicao para ser um CNPJ
			if (numero.length() == 14) {
				
				char dig13, dig14;
				
				// Calculo do 1o. Digito Verificador
				sm = 0;
				peso = 2;
				for (i = 11; i >= 0; i--) {
					// converte o i-ésimo caractere do CNPJ em um número:
					// por exemplo, transforma o caractere '0' no inteiro 0
					// (48 eh a posição de '0' na tabela ASCII)
					num = (int) (numero.charAt(i) - 48);
					sm = sm + (num * peso);
					peso = peso + 1;
					if (peso == 10)
						peso = 2;
				}

				r = sm % 11;
				if ((r == 0) || (r == 1))
					dig13 = '0';
				else
					dig13 = (char) ((11 - r) + 48);

				// Calculo do 2o. Digito Verificador
				sm = 0;
				peso = 2;
				for (i = 12; i >= 0; i--) {
					num = (int) (numero.charAt(i) - 48);
					sm = sm + (num * peso);
					peso = peso + 1;
					if (peso == 10)
						peso = 2;
				}

				r = sm % 11;
				if ((r == 0) || (r == 1))
					dig14 = '0';
				else
					dig14 = (char) ((11 - r) + 48);

				// Verifica se os dígitos calculados conferem com os dígitos informados.
				if ((dig13 == numero.charAt(12)) && (dig14 == numero.charAt(13))) {
					setNumero(numero);
					return (true);
				}

				else {
					return (false);
				}
			}
		} catch (InputMismatchException erro) {
			return (false);
		}

		return false;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String imprimeCPF() {
		return (this.numero.substring(0, 3) + "." + this.numero.substring(3, 6) + "." + this.numero.substring(6, 9)
				+ "-" + this.numero.substring(9, 11));
	}

	public String imprimeCNPJ() {
		// máscara do CNPJ: 99.999.999.9999-99
		return (this.numero.substring(0, 2) + "." + this.numero.substring(2, 5) + "." + this.numero.substring(5, 8)
				+ "." + this.numero.substring(8, 12) + "-" + this.numero.substring(12, 14));
	}

}
