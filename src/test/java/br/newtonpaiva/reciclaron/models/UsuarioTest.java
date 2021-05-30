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
public class UsuarioTest {

	/**
	 * Test method for
	 * {@link br.newtonpaiva.reciclaron.models.Usuario#isTelefoneValido()}.
	 */
	@Test
	public void testIsTelefoneValido_coletor_deve_retornar_true() {
		Coletor coletor = new Coletor();
		coletor.setTelefoneUsuario("(31) 98499-9944");
		assertTrue(coletor.isTelefoneValido());
	}

	/**
	 * Test method for
	 * {@link br.newtonpaiva.reciclaron.models.Usuario#isTelefoneValido()}.
	 */
	@Test
	public void testIsTelefoneValido_coletor_deve_retornar_false() {
		Coletor coletor = new Coletor();
		coletor.setTelefoneUsuario("8499-9944");
		assertFalse(coletor.isTelefoneValido());
	}

	/**
	 * Test method for
	 * {@link br.newtonpaiva.reciclaron.models.Usuario#isTelefoneValido()}.
	 */
	@Test
	public void testIsTelefoneValido_gerador_deve_retornar_true() {
		Gerador gerador = new Gerador();
		gerador.setTelefoneUsuario("(38) 99814-0593");
		assertTrue(gerador.isTelefoneValido());
	}

	/**
	 * Test method for
	 * {@link br.newtonpaiva.reciclaron.models.Usuario#isTelefoneValido()}.
	 */
	@Test
	public void testIsTelefoneValido_gerador_deve_retornar_false() {
		Gerador gerador = new Gerador();
		gerador.setTelefoneUsuario("99814-0593");
		assertFalse(gerador.isTelefoneValido());
	}

	/**
	 * Test method for
	 * {@link br.newtonpaiva.reciclaron.models.Usuario#isTelefoneValido()}.
	 */
	@Test
	public void testIsTelefoneValido_empresa_deve_retornar_true() {
		Empresa empresa = new Empresa();
		empresa.setTelefoneUsuario("(38) 99814-0593");
		assertTrue(empresa.isTelefoneValido());
	}

	/**
	 * Test method for
	 * {@link br.newtonpaiva.reciclaron.models.Usuario#isTelefoneValido()}.
	 */
	@Test
	public void testIsTelefoneValido_empresa_deve_retornar_false() {
		Empresa empresa = new Empresa();
		empresa.setTelefoneUsuario("99814-0593");
		assertFalse(empresa.isTelefoneValido());
	}

	/**
	 * Test method for
	 * {@link br.newtonpaiva.reciclaron.models.Usuario#isEmailValido()}.
	 */
	@Test
	public void testIsEmailValido_coletor_deve_retornar_true() {
		Coletor coletor = new Coletor();
		coletor.setEmailUsuario("coletor@reciclaron.com.br");
		assertTrue(coletor.isEmailValido());
	}

	/**
	 * Test method for
	 * {@link br.newtonpaiva.reciclaron.models.Usuario#isEmailValido()}.
	 */
	@Test
	public void testIsEmailValido_coletor_deve_retornar_false() {
		Coletor coletor = new Coletor();
		coletor.setEmailUsuario("coletor@reciclaron");
		assertFalse(coletor.isEmailValido());
	}

	/**
	 * Test method for
	 * {@link br.newtonpaiva.reciclaron.models.Usuario#isEmailValido()}.
	 */
	@Test
	public void testIsEmailValido_empresa_deve_retornar_true() {
		Empresa empresa = new Empresa();
		empresa.setEmailUsuario("empresa@reciclaron.com.br");
		assertTrue(empresa.isEmailValido());
	}

	/**
	 * Test method for
	 * {@link br.newtonpaiva.reciclaron.models.Usuario#isEmailValido()}.
	 */
	@Test
	public void testIsEmailValido_empresa_deve_retornar_false() {
		Empresa empresa = new Empresa();
		empresa.setEmailUsuario("empresa@reciclaron");
		assertFalse(empresa.isEmailValido());
	}

	/**
	 * Test method for
	 * {@link br.newtonpaiva.reciclaron.models.Usuario#isEmailValido()}.
	 */
	@Test
	public void testIsEmailValido_gerador_deve_retornar_true() {
		Gerador gerador = new Gerador();
		gerador.setEmailUsuario("gerador@reciclaron.com.br");
		assertTrue(gerador.isEmailValido());
	}

	/**
	 * Test method for
	 * {@link br.newtonpaiva.reciclaron.models.Usuario#isEmailValido()}.
	 */
	@Test
	public void testIsEmailValido_gerador_deve_retornar_false() {
		Gerador gerador = new Gerador();
		gerador.setEmailUsuario("gerador@reciclaron");
		assertFalse(gerador.isEmailValido());
	}

	/**
	 * Test method for
	 * {@link br.newtonpaiva.reciclaron.models.Usuario#isEnderecoValido()}.
	 */
	@Test
	public void testIsEnderecoValido_coletor_deve_retornar_true() {
		Coletor coletor = new Coletor();
		coletor.setEnderecoUsuario("Rua Principal, 309, Santo Antônio do Salto, Ouro Preto, MG");
		assertTrue(coletor.isEnderecoValido());
	}

	/**
	 * Test method for
	 * {@link br.newtonpaiva.reciclaron.models.Usuario#isEnderecoValido()}.
	 */
	@Test
	public void testIsEnderecoValido_coletor_deve_retornar_false() {
		Coletor coletor = new Coletor();
		coletor.setEnderecoUsuario(null);
		assertFalse(coletor.isEnderecoValido());
	}

	/**
	 * Test method for
	 * {@link br.newtonpaiva.reciclaron.models.Usuario#isEnderecoValido()}.
	 */
	@Test
	public void testIsEnderecoValido_empresa_deve_retornar_true() {
		Empresa empresa = new Empresa();
		empresa.setEnderecoUsuario("Rua São Francisco de Paula, 457, Centro, Tiradentes, MG");
		assertTrue(empresa.isEnderecoValido());
	}

	/**
	 * Test method for
	 * {@link br.newtonpaiva.reciclaron.models.Usuario#isEnderecoValido()}.
	 */
	@Test
	public void testIsEnderecoValido_empresa_deve_retornar_false() {
		Empresa empresa = new Empresa();
		empresa.setEnderecoUsuario(null);
		assertFalse(empresa.isEnderecoValido());
	}

	/**
	 * Test method for
	 * {@link br.newtonpaiva.reciclaron.models.Usuario#isEnderecoValido()}.
	 */
	@Test
	public void testIsEnderecoValido_gerador_deve_retornar_true() {
		Gerador gerador = new Gerador();
		gerador.setEnderecoUsuario("Praça Correa Rabelo, 109, Centro, Diamantina, MG");
		assertTrue(gerador.isEnderecoValido());
	}

	/**
	 * Test method for
	 * {@link br.newtonpaiva.reciclaron.models.Usuario#isEnderecoValido()}.
	 */
	@Test
	public void testIsEnderecoValido_gerador_deve_retornar_false() {
		Gerador gerador = new Gerador();
		gerador.setEnderecoUsuario(null);
		assertFalse(gerador.isEnderecoValido());
	}

}
