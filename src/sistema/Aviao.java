package sistema;

/**
 * Classe que representa um Avi„o
 * 
 * @author Ot√°vio Camargo Marciano - 201900244
 */
public class Aviao {

	private String modelo;
	private int quantidadeDeAssentos;

	/**
	 * Construtor para inicializar o objeto Aviao a partir do modelo e
	 * quantidadeDeAssentos.
	 * 
	 * @param modelo
	 * @param quantidadeDeAssentos
	 */
	public Aviao(String modelo, int quantidadeDeAssentos) {
		this.modelo = modelo;
		this.quantidadeDeAssentos = quantidadeDeAssentos;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getQuantidadeDeAssentos() {
		return quantidadeDeAssentos;
	}

	public void setQuantidadeDeAssentos(int quantidadeDeAssentos) {
		this.quantidadeDeAssentos = quantidadeDeAssentos;
	}

}
