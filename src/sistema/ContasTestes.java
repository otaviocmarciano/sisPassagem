package sistema;

public class ContasTestes {
	
	public Conta contaAna = new Conta();
	public Cartao cartaoAna = new Cartao();
	public Conta contaJoao = new Conta();
	public Cartao cartaoJoao = new Cartao();
	public Conta contaHenrique = new Conta();
	public Cartao cartaoHenrique = new Cartao();
	
	
	public ContasTestes() {
		contaAna.setNomeTitular("Ana Maria");
		contaAna.setNumero(1654631);
		contaAna.setSaldo(5784.6);
		contaAna.setTipo("Conta Corrente");
		cartaoAna.setConta(contaAna);
		cartaoAna.setNumero("12345");
		
		
		
		contaAna.setNomeTitular("Joao Otavio");
		contaAna.setNumero(135465);
		contaAna.setSaldo(300.0);
		contaAna.setTipo("Conta Corrente");
		
		contaAna.setNomeTitular("Henrique Campos");
		contaAna.setNumero(76513);
		contaAna.setSaldo(2800.53);
		contaAna.setTipo("Conta Corrente");
		
		
	}
	
	
	
	
}
