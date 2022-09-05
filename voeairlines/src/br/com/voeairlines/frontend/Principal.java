package br.com.voeairlines.frontend;

import javax.swing.JOptionPane;

import br.com.voeairlines.bo.ClienteBO;
import br.com.voeairlines.bo.PilotoBO;

public class Principal {

	public static void main(String[] args) {
		
		ClienteBO cbo = new ClienteBO();
		
		PilotoBO pbo = new PilotoBO();
		
		JOptionPane.showMessageDialog(null, "VoeAirlines: voando alto com você!");
		
		int idade;
		String leiaIdade;
		
		leiaIdade = JOptionPane.showInputDialog("Digite sua idade: ");
		
		//classe wrappler
		idade = Integer.parseInt(leiaIdade);
		
		
		JOptionPane.showMessageDialog(null, cbo.validaIdade(idade));
		
		
		String nomePiloto;
		
		nomePiloto = JOptionPane.showInputDialog("Digite o nome do piloto: ");
		
		JOptionPane.showMessageDialog(null, pbo.validaPiloto(nomePiloto));
		
		/*if(idade < 18) {
			JOptionPane.showMessageDialog(null, "Embarque não autorizado!", "VoeAirlines", JOptionPane.ERROR_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, "Boa viajem! VoeAirlines: voando alto com você!", "VoeAirlines", JOptionPane.INFORMATION_MESSAGE);
		}*/
		
		/*Aeronave aeronave1 = new Aeronave("Embraery", "Bandeirante", "EMB-100");
		AeronaveDAO aeronaveDAO1 = new AeronaveDAO();
		System.out.println(aeronaveDAO1.cadastrarAeronave(aeronave1));
		
		Aeronave aeronave2 = new Aeronave("Embraery", "Bandeirante", "EMB-110");
		AeronaveDAO aeronaveDAO2 = new AeronaveDAO();
		System.out.println(aeronaveDAO2.cadastrarAeronave(aeronave2));
		
		Aeronave aeronave3 = new Aeronave("Embraery", "Bandeirante", "EMB-110A");
		AeronaveDAO aeronaveDAO3 = new AeronaveDAO();
		System.out.println(aeronaveDAO3.cadastrarAeronave(aeronave3));
		
		Aeronave aeronave4 = new Aeronave("Embraery", "Bandeirante", "EMB-110B");
		AeronaveDAO aeronaveDAO4 = new AeronaveDAO();
		System.out.println(aeronaveDAO4.cadastrarAeronave(aeronave4));
		
		Aeronave aeronave5 = new Aeronave("Embraery", "Bandeirante", "EMB-110B1");
		AeronaveDAO aeronaveDAO5 = new AeronaveDAO();
		System.out.println(aeronaveDAO5.cadastrarAeronave(aeronave5));
		
		Aeronave aeronave6 = new Aeronave("Embraery", "Bandeirante", "EMB-110C");
		AeronaveDAO aeronaveDAO6 = new AeronaveDAO();
		System.out.println(aeronaveDAO6.cadastrarAeronave(aeronave6));
		
		Aeronave aeronave7 = new Aeronave("Embraery", "Bandeirante", "EMB-110E");
		AeronaveDAO aeronaveDAO7 = new AeronaveDAO();
		System.out.println(aeronaveDAO7.cadastrarAeronave(aeronave7));
		
		
		Manutencao manutencao = new Manutencao("Troca de óleo próxima revisão", "Revisão do motor direito");
		System.out.println(new ManutencaoDAO().cadastrarManutencao(manutencao));*/
	}

}
