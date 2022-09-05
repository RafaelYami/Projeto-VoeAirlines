package br.com.voeairlines.bo;

public class PilotoBO implements IValidacaoDecolar {

	@Override
	public String validaPiloto(String nome) {
		String r;
		if(nome.equals(IValidacaoDecolar.MOCKPILOTO)) {
			r = "Decolagem autorizada! Boa viajem!";
		}else {
			r = "Decolagem não autorizada!";
		}
		return r;
	}
	
}
