package br.newtonpaiva.reciclaron.models;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author kevin
 *
 */
public abstract class Usuario {
	private String nomeUsuario;
	private String enderecoUsuario;
	private String telefoneUsuario;
	private String emailUsuario;
	private String numeroDocumento;
	private static final Pattern PATTERN_VALID_PHONE_NUMBER = Pattern
			.compile("^((\\(\\d{2}\\)))[- .]?((\\d{5}|\\d{4}))[- .]?\\d{4}$");
	private static final Pattern PATTERN_VALID_EMAIL_ADDRESS_REGEX = Pattern
			.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getEnderecoUsuario() {
		return enderecoUsuario;
	}

	public void setEnderecoUsuario(String enderecoUsuario) {
		this.enderecoUsuario = enderecoUsuario;
	}

	public String getTelefoneUsuario() {
		return telefoneUsuario;
	}

	public void setTelefoneUsuario(String telefoneUsuario) {
		this.telefoneUsuario = telefoneUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	/**
	 * Realiza login
	 */
	public void login() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Recupera senha
	 */
	public void recuperarSenha() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Valida o número de telefone
	 * 
	 * @return Retorna true se o número for válido
	 */
	public boolean isTelefoneValido() {
		Matcher matcher = PATTERN_VALID_PHONE_NUMBER.matcher(this.telefoneUsuario);
		return matcher.matches();
	}

	/**
	 * Valida o endereço de email
	 * @return Retorna true se o endereço de email for válido
	 */
	public boolean isEmailValido() {
		Matcher matcher = PATTERN_VALID_EMAIL_ADDRESS_REGEX.matcher(this.emailUsuario);
        return matcher.matches();
	}

	/**
	 * Valida o endereço
	 * @return Retorna true se o endereço for válido
	 */
	public boolean isEnderecoValido() {
		if (this.enderecoUsuario == null) {
			return false;
		}
		
		String[] camposEndereco = this.enderecoUsuario.split(", ");
		return camposEndereco.length == 5;
	}

	/**
	 * Valida CPF/CNPJ
	 * 
	 * @return Retorna true se o CPF/CNPJ for válido
	 */
	public abstract boolean isNumeroDocumentoValido();
}
