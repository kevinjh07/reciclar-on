package br.newtonpaiva.reciclaron.models;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author kevin
 *
 */
public class Gerador extends Usuario {

	@Override
	public void cadastrarUsuario() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean validarNumeroDocumento() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Usuario> listarUsuarios() {
		// TODO Auto-generated method stub
		return new ArrayList<>();
	}
}
