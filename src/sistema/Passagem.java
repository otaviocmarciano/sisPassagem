/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Classe que representa uma Passagem.
 * @author OtÃ¡vio Camargo Marciano - 201900244
 */
public class Passagem {

	private double valor;
	private String id;
	private Pessoa titular;
	private Assento assento;
	private Voo voo;
	protected static List<String> ids = new ArrayList<>();

	/**
	 * 
	 * Construtor que inicializa o objeto Passagem a partir dos parâmetros titular e
	 * assento.
	 * 
	 * @param titular
	 * @param assento
	 */
	public Passagem(Pessoa titular, Assento assento) {

		this.titular = titular;
		this.assento = assento;
		this.id = geraId();
	}

	public double defineValor() {
		return 0;
		// To change body of generated methods, choose Tools | Templates.
	}

	/**
	 * Método que gera Id aleatório e que não foi usado anteriormente.
	 * 
	 * @return
	 */
	@SuppressWarnings("unused")
	private String geraId() {
		Random r = new Random();
		String codigo;
		String letra1, letra2;
		String[] a = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
				"T", "U", "V", "W", "X", "Y", "Z" };
		int n1, n2;

		n: for (;;) {
			n1 = r.nextInt(9);
			n2 = r.nextInt(9);
			letra1 = a[r.nextInt(25)];
			letra2 = a[r.nextInt(25)];

			codigo = String.format("%s%s%d%d", letra1, letra2, n1, n2);
			if (!ids.contains(codigo)) {
				ids.add(codigo);
				return codigo;
			}
		}
	}

	/**
	 * Método que calcula a distância entre duas cidades e retorna esse valor.
	 * 
	 * @return
	 */
	public double calculaDistancia() {
		return DistanciaCidades.calcula(voo.getPartida().getCodigo().getLatitude(),
				voo.getPartida().getCodigo().getLongitude(), voo.getDestino().getCodigo().getLatitude(),
				voo.getDestino().getCodigo().getLongitude());
	}

	/**
	 * Método que calcula a taxa com base na distância do Método calculaDistancia.
	 * 
	 * @return
	 */
	public double cobraTaxaKm() {
		double distancia = calculaDistancia();
		return (distancia < 1000) ? (distancia * 0.3) : (distancia * 0.7);
	}

	/**
	 * Método que retorna uma String dos dados da passagem.
	 */
	@Override
	public String toString() {
		return String.format("------ Passagem ------%n")
				+ String.format("Passagem ID: %s - Assento %s%n", this.getId(), this.getAssento().getPosicao())
				+ String.format("Nome do Titular: %s %n", this.getTitular().getNome())
				+ String.format("CPF: %s%n", this.getTitular().getCpf())
				+ String.format("Numero do Passaporte: %s%n", this.getTitular().getPassaporte().getNumPassaporte())
				+ String.format("Voo: %s", this.voo.getDestino().getEstado() + " - " + this.voo.getDestino().getNome());

	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Pessoa getTitular() {
		return titular;
	}

	public void setTitular(Pessoa titular) {
		this.titular = titular;
	}

	public Assento getAssento() {
		return assento;
	}

	public void setAssento(Assento assento) {
		this.assento = assento;
	}

	public Voo getVoo() {
		return voo;
	}

	public void setVoo(Voo voo) {
		this.voo = voo;
	}

}
