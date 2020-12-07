/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Classe que representa uma pessoa.
 * 
 * @author Ot√°vio Camargo Marciano - 201900244
 */
public class Pessoa {

	private String nome;
	private String cpf;
	private Conta conta;
	private LocalDateTime dataDeNascimento;
	private Passaporte passaporte;

	/**
	 * Construtor que inicializa o objeto Pessoa sem par‚metros.
	 */
	public Pessoa() {

	}

	/**
	 * Construtor que inicializa o objeto Pessoa com os par‚metros nome, cpf,
	 * dataDeNascimento e passaporte.
	 * 
	 * @param nome
	 * @param cpf
	 * @param dataDeNascimento
	 * @param passaporte
	 */
	public Pessoa(String nome, String cpf, LocalDateTime dataDeNascimento, Passaporte passaporte) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataDeNascimento = dataDeNascimento;
		this.passaporte = passaporte;
	}

	public boolean verificaCrianca() {
		return LocalDateTime.now().getYear() - dataDeNascimento.getYear() <= 6;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDateTime getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDateTime dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public Passaporte getPassaporte() {
		return passaporte;
	}

	public void setPassaporte(Passaporte passaporte) {
		this.passaporte = passaporte;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

}
