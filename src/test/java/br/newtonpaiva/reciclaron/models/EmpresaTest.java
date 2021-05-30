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
public class EmpresaTest {

	/**
	 * Test method for
	 * {@link br.newtonpaiva.reciclaron.models.Empresa#isNumeroDocumentoValido()}.
	 */
	@Test
	public void testIsNumeroDocumentoValido_cnpj_correto_deve_retornar_true() {
		Empresa empresa = new Empresa();
		empresa.setNumeroDocumento("34263553000159");
		assertTrue(empresa.isNumeroDocumentoValido());
	}

	/**
	 * Test method for
	 * {@link br.newtonpaiva.reciclaron.models.Empresa#isNumeroDocumentoValido()}.
	 */
	@Test
	public void testIsNumeroDocumentoValido_cnpj_incorreto_deve_retornar_false() {
		Empresa empresa = new Empresa();
		empresa.setNumeroDocumento("263553000159");
		assertFalse(empresa.isNumeroDocumentoValido());
	}

	/**
	 * Test method for
	 * {@link br.newtonpaiva.reciclaron.models.Empresa#listarColetores()}.
	 */
	@Test
	public void testListarColetores_deve_retornar_lista_vazia() {
		Empresa empresa = new Empresa();
		assertEquals(Collections.emptyList(), empresa.listarColetores());
	}

}
