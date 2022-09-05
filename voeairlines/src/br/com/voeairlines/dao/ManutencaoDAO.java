package br.com.voeairlines.dao;

import br.com.voeairlines.entities.Manutencao;

public class ManutencaoDAO {
	
	public String cadastrarManutencao(Manutencao manutencao) {
		
		return manutencao.getDescricaoServico();
		
	}
	
}
