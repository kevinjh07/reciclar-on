package br.newtonpaiva.reciclaron.models;

/**
 * 
 * @author kevin
 *
 */
public class Gerador extends Usuario {

	@Override
	public boolean isNumeroDocumentoValido() {
		int quantidadeCaracteresCpf = 11;
		return super.getNumeroDocumento() != null && super.getNumeroDocumento().length() == quantidadeCaracteresCpf;
	}
}
