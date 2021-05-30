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
	private String numeroDocumento;

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	
	/**
	 * 
	 * @return Dias disponíveis para agendamento
	 */
	public List<LocalDate> verificarDiasDisponiveis() {
		return new ArrayList<>();
	}
}
