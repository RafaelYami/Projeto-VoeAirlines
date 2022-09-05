package br.com.voeairlines.bo;

public class ClienteBO implements IValidacaoEmbarque {
	
	//Sobrepor - Polimorfismo.
	@Override
	public String validaIdade(int idade) {
		String r;
		
		if(idade < IValidacaoEmbarque.IDADEMIN) {
			r = "Embarque não autorizado! O responsável deve ser maior de idade.";
		}else {
			r = "Boa viajem! VoeAirlines: voando alto com você!";
		}
		return r;
		}
}