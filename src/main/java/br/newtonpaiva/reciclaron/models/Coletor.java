package br.newtonpaiva.reciclaron.models;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author kevin
 *
 */
public class Coletor extends Usuario {

	@Override
	public boolean isNumeroDocumentoValido() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Agenda entrega
	 * @return Retorna agendamento da entrega
	 */
	public AgendamentoEntrega agendarEntrega() {
		return null;
	}

	/**
	 * Lista empresas cadastradas
	 * @return Retorna empresas cadastradas
	 */
	public List<Usuario> listarEmpresasCadastradas() {
		return new ArrayList<>();
	}
}
