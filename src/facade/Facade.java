package facade;

import SubSistema.CepAPI;
import SubSistema.Service;

public class Facade {
	
	public void migrarCliente(String nome, String cep) {
		String cidade = CepAPI.getInstancia().recuperarCidade(cep);
		String estado = CepAPI.getInstancia().recuperarEstado(cep);
		
		Service.gravarCliente(nome, cep, cidade, estado);
	}

}
