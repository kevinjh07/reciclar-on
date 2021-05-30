/**
 * 
 */
package br.newtonpaiva.reciclaron.models;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author kevin
 *
 */
public class GeradorTest {

	/**
	 * Test method for
	 * {@link br.newtonpaiva.reciclaron.models.Gerador#isNumeroDocumentoValido()}.
	 */
	@Test
	public void testIsNumeroDocumentoValido_cpf_correto_deve_retornar_true() {
		Gerador gerador = new Gerador();
		gerador.setNumeroDocumento("81616876840");
		assertTrue(gerador.isNumeroDocumentoValido());
	}

	/**
	 * Test method for
	 * {@link br.newtonpaiva.reciclaron.models.Gerador#isNumeroDocumentoValido()}.
	 */
	@Test
	public void testIsNumeroDocumentoValido_cpf_incorreto_deve_retornar_false() {
		Gerador gerador = new Gerador();
		gerador.setNumeroDocumento("616876840");
		assertFalse(gerador.isNumeroDocumentoValido());
	}

}
