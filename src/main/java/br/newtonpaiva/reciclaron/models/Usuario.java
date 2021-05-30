package br.newtonpaiva.reciclaron.models;

import java.util.List;

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
	 */
	public void validarTelefone() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Valida o endereço de email
	 */
	public void validarEmail() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Valida o endereço
	 */
	public void validarEndereco() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Cadastra usuário
	 */
	public abstract void cadastrarUsuario();

	/**
	 * Valida CPF/CNPJ
	 * 
	 * @return Retorna true se o CPF/CNPJ for válido
	 */
	public abstract boolean validarNumeroDocumento();

	/**
	 * Lista usuários
	 * 
	 * @return Retornar uma lista de usuários
	 */
	public abstract List<Usuario> listarUsuarios();
}
