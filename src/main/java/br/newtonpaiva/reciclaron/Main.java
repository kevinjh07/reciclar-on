package br.newtonpaiva.reciclaron;

import java.math.BigDecimal;

import br.newtonpaiva.reciclaron.models.AgendamentoEntrega;
import br.newtonpaiva.reciclaron.models.Coletor;
import br.newtonpaiva.reciclaron.models.Empresa;
import br.newtonpaiva.reciclaron.models.Gerador;
import br.newtonpaiva.reciclaron.models.Residuo;
import br.newtonpaiva.reciclaron.models.TipoResiduo;

public class Main {

	public static void main(String[] args) {
		Coletor coletor = getColetor();
		System.out.println("----- COLETOR -----");
		System.out.println(coletor.toString() + "\n");

		Empresa empresa = getEmpresa();
		System.out.println("----- EMPRESA -----");
		System.out.println(empresa.toString() + "\n");

		Gerador gerador = getGerador();
		System.out.println("----- GERADOR -----");
		System.out.println(gerador.toString() + "\n");

		Residuo residuo = getResiduo();
		System.out.println("----- RESIDUO -----");
		System.out.println(residuo.toString() + "\n");

		AgendamentoEntrega agendamentoEntrega = getAgendamentoEmpresa(gerador);
		System.out.println("----- AGENDAMENTO ENTREGA -----");
		System.out.println(agendamentoEntrega.toString() + "\n");
	}

	private static Coletor getColetor() {
		Coletor coletor = new Coletor();
		coletor.setNomeUsuario("Débora Oliveira");
		coletor.setEmailUsuario("coletor@reciclaron.com.br");
		coletor.setEnderecoUsuario("Rua Principal, 309, Santo Antônio do Salto, Ouro Preto, MG");
		coletor.setNumeroDocumento("44559853606");
		coletor.setTelefoneUsuario("(31) 98499-9944");
		return coletor;
	}

	private static Empresa getEmpresa() {
		Empresa empresa = new Empresa();
		empresa.setNomeUsuario("INSTITUTO CULTURAL NEWTON PAIVA LTDA");
		empresa.setEmailUsuario("empresa@reciclaron.com.br");
		empresa.setEnderecoUsuario("Rua São Francisco de Paula, 457, Centro, Tiradentes, MG");
		empresa.setNumeroDocumento("34263553000159");
		empresa.setTelefoneUsuario("(32) 2739-2115");
		return empresa;
	}

	private static Gerador getGerador() {
		Gerador gerador = new Gerador();
		gerador.setNomeUsuario("Luís Cardoso");
		gerador.setEmailUsuario("gerador@reciclaron.com.br");
		gerador.setEnderecoUsuario("Praça Correa Rabelo, 109, Centro, Diamantina, MG");
		gerador.setNumeroDocumento("81616876840");
		gerador.setTelefoneUsuario("(38) 99814-0593");
		return gerador;
	}

	private static Residuo getResiduo() {
		Residuo residuo = new Residuo();
		residuo.setAtivoResiduo(true);
		residuo.setQuantidadeResiduo(10);
		residuo.setTipoResiduo(TipoResiduo.ALUMINIO);
		residuo.setValorResiduo(BigDecimal.valueOf(23.50));
		return residuo;
	}

	private static AgendamentoEntrega getAgendamentoEmpresa(Gerador gerador) {
		return new AgendamentoEntrega(gerador.getNumeroDocumento());
	}
}
