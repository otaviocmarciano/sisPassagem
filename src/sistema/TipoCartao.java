/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

/**
 * Tipos de cartıes que podem ser usados.
 * 
 * @author ocmma
 */
public enum TipoCartao {
	DEB("D√©bito"), CRED("Cr√©dito");

	private final String tipo;

	/**
	 * Tipo do Cart„o
	 * 
	 * @param tipo
	 */
	TipoCartao(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

}
