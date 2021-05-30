package br.newtonpaiva.reciclaron.models;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author kevin
 *
 */
public class Empresa extends Usuario {

	@Override
	public boolean isNumeroDocumentoValido() {
		int quantidadeCaracteresCnpj = 14;
		return super.getNumeroDocumento() != null && super.getNumeroDocumento().length() == quantidadeCaracteresCnpj;
	}

	/**
	 * Lista coletores
	 * 
	 * @return Retorna a lista de coletores cadastrados
	 */
	public List<Coletor> listarColetores() {
		return new ArrayList<>();
	}
}
