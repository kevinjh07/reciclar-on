package br.newtonpaiva.reciclaron.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author kevin
 *
 */
public class AgendamentoEntrega {
	
	private final String numeroDocumento;

	public AgendamentoEntrega(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	
	/**
	 * 
	 * @return Dias disponíveis para agendamento
	 */
	public List<LocalDate> verificarDiasDisponiveis() {
		return new ArrayList<>();
	}

	@Override
	public String toString() {
		return "AgendamentoEntrega{" +
				"numeroDocumento='" + numeroDocumento + '\'' +
				'}';
	}
}
