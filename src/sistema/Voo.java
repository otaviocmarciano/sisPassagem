/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Classe que representa um Voo de um avi„o.
 * 
 * @author Ot√°vio Camargo Marciano - 201900244
 */
public class Voo {

	private Assento assentosVoo[][];
	private Aviao aviao;
	private String horaDeSaida;
	private String horaDeChegada;
	private List<Cidade> paradas;
	private Cidade destino;
	private Cidade partida;

	public Cidade getPartida() {
		return partida;
	}

	public void setPartida(Cidade partida) {
		this.partida = partida;
	}

	public Voo(Assento[][] assentosVoo, Aviao aviao, String horaDeSaida, String horaDeChegada, List<Cidade> paradas,
			Cidade destino, Cidade partida) {
		this.assentosVoo = assentosVoo;
		this.aviao = aviao;
		this.horaDeSaida = horaDeSaida;
		this.horaDeChegada = horaDeChegada;
		this.paradas = paradas;
		this.destino = destino;
		this.partida = partida;
	}

	public Assento[][] getAssentosVoo() {
		return assentosVoo;
	}

	public void setAssentosVoo(Assento[][] assentosVoo) {
		this.assentosVoo = assentosVoo;
	}

	public Aviao getAviao() {
		return aviao;
	}

	public void setAviao(Aviao aviao) {
		this.aviao = aviao;
	}

	public String getHoraDeSaida() {
		return horaDeSaida;
	}

	public void setHoraDeSaida(String horaDeSaida) {
		this.horaDeSaida = horaDeSaida;
	}

	public String getHoraDeChegada() {
		return horaDeChegada;
	}

	public void setHoraDeChegada(String horaDeChegada) {
		this.horaDeChegada = horaDeChegada;
	}

	public List<Cidade> getParadas() {
		return paradas;
	}

	public void setParadas(List<Cidade> paradas) {
		this.paradas = paradas;
	}

	public Cidade getDestino() {
		return destino;
	}

	public void setDestino(Cidade destino) {
		this.destino = destino;
	}

	public void registraAssento(int linha, int coluna) {
		assentosVoo[linha][coluna] = new Assento(true, horaDeChegada);
		assentosVoo[linha][coluna].setPosicao(String.format("Assento %d.%d", linha, coluna));
	}

}
