package br.newtonpaiva.reciclaron;

import br.newtonpaiva.reciclaron.models.Coletor;
import br.newtonpaiva.reciclaron.models.Empresa;
import br.newtonpaiva.reciclaron.models.Gerador;

public class Main {

	public static void main(String[] args) {
		Coletor coletor = new Coletor();
		coletor.setNomeUsuario("Débora Oliveira");
		coletor.setEmailUsuario("coletor@reciclaron.com.br");
		coletor.setEnderecoUsuario("Rua Principal, 309, Santo Antônio do Salto, Ouro Preto, MG");
		coletor.setNumeroDocumento("44559853606");
		coletor.setTelefoneUsuario("(31) 98499-9944");

		System.out.println("----- COLETOR -----");
		System.out.println(coletor.toString());

		Empresa empresa = new Empresa();
		empresa.setNomeUsuario("INSTITUTO CULTURAL NEWTON PAIVA LTDA");
		empresa.setEmailUsuario("empresa@reciclaron.com.br");
		empresa.setEnderecoUsuario("Rua São Francisco de Paula, 457, Centro, Tiradentes, MG");
		empresa.setNumeroDocumento("34263553000159");
		empresa.setTelefoneUsuario("(32) 2739-2115");

		System.out.println("----- EMPRESA -----");
		System.out.println(empresa.toString());

		Gerador gerador = new Gerador();
		gerador.setNomeUsuario("Luís Cardoso");
		gerador.setEmailUsuario("gerador@reciclaron.com.br");
		gerador.setEnderecoUsuario("Praça Correa Rabelo, 109, Centro, Diamantina, MG");
		gerador.setNumeroDocumento("81616876840");
		gerador.setTelefoneUsuario("(38) 99814-0593");

		System.out.println("----- GERADOR -----");
		System.out.println(gerador.toString());
	}

}
