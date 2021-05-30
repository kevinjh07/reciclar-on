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
		int quantidadeCaracteresCpf = 11;
		return super.getNumeroDocumento() != null && super.getNumeroDocumento().length() == quantidadeCaracteresCpf;
	}

	/**
	 * Agenda entrega
	 * 
	 * @return Retorna agendamento da entrega
	 */
	public AgendamentoEntrega agendarEntrega() {
		AgendamentoEntrega agendamento = new AgendamentoEntrega(this.getNumeroDocumento());
		return agendamento;
	}

	/**
	 * Lista empresas cadastradas
	 * 
	 * @return Retorna empresas cadastradas
	 */
	public List<Usuario> listarEmpresasCadastradas() {
		return new ArrayList<>();
	}
}
