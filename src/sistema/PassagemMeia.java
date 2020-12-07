/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

/**
 * Classe que representa uma passagem meia.
 * 
 * @author Ot√°vio Camargo Marciano - 201900244
 */
public class PassagemMeia extends Passagem {

	private static int qtdCriancas = 0;

	/**
	 * Construtor que inicializa o objeto PassagemMeia com base nos par‚metros
	 * titular e assento.
	 * 
	 * @param titular
	 * @param assento
	 */
	public PassagemMeia(Pessoa titular, Assento assento) {
		super(titular, assento);
	}

	public double defineValor() {
		return cobraTaxaKm() / 2;

	}

	public static int getQtdCriancas() {
		return qtdCriancas;
	}

	public static void setQtdCriancas(int qtdCriancas) {
		PassagemMeia.qtdCriancas = qtdCriancas;
	}

}
