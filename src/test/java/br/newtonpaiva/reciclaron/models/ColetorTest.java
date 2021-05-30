/**
 * 
 */
package br.newtonpaiva.reciclaron.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Collections;

import org.junit.Test;

/**
 * @author kevin
 *
 */
public class ColetorTest {

	/**
	 * Test method for
	 * {@link br.newtonpaiva.reciclaron.models.Coletor#isNumeroDocumentoValido()}.
	 */
	@Test
	public void testIsNumeroDocumentoValido_cpf_correto_deve_retornar_true() {
		Coletor coletor = new Coletor();
		coletor.setNumeroDocumento("44559853606");
		assertTrue(coletor.isNumeroDocumentoValido());
	}

	/**
	 * Test method for
	 * {@link br.newtonpaiva.reciclaron.models.Coletor#isNumeroDocumentoValido()}.
	 */
	@Test
	public void testIsNumeroDocumentoValido_cpf_incorreto_deve_retornar_false() {
		Coletor coletor = new Coletor();
		coletor.setNumeroDocumento("4559853606");
		assertFalse(coletor.isNumeroDocumentoValido());
	}

	/**
	 * Test method for
	 * {@link br.newtonpaiva.reciclaron.models.Coletor#agendarEntrega()}.
	 */
	@Test
	public void testAgendarEntrega_deve_retornar_numero_documento_com_lista_vazia() {
		Coletor coletor = new Coletor();
		coletor.setNumeroDocumento("44559853606");
		AgendamentoEntrega agendamento = coletor.agendarEntrega();
		assertEquals("44559853606", agendamento.getNumeroDocumento());
		assertEquals(Collections.emptyList(), agendamento.verificarDiasDisponiveis());
	}

	/**
	 * Test method for
	 * {@link br.newtonpaiva.reciclaron.models.Coletor#listarEmpresasCadastradas()}.
	 */
	@Test
	public void testListarEmpresasCadastradas_deve_retornar_lista_vazia() {
		Coletor coletor = new Coletor();
		assertEquals(Collections.emptyList(), coletor.listarEmpresasCadastradas());
	}

}
