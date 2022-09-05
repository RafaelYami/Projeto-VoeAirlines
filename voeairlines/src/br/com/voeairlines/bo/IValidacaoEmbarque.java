package br.com.voeairlines.bo;

public interface IValidacaoEmbarque {

	//static - é da classe
	//no-static - é de instância(do objeto)
	//Cliente c = new Cliente();
	//c.cadastrar("Rafael");
	
	//Cliente.cadastrar("Rafael");
	//Classe ManipularArquivo();
	//Manipulacao.ManipularArquivo();
	
	public static final int IDADEMIN = 18; //constante
	
	public abstract String validaIdade(int idade); //assinatura de contrato
	
}
