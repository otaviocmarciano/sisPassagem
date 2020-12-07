package sistema;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * 
 * Classe que instancia várias contas, pessoas e cartões(de crédito ou débito) e
 * as colocam em uma lista.
 *
 */
public class ContasTestes {

	public Pessoa ana = new Pessoa();
	public Passaporte passaporteAna = new Passaporte();
	public Conta contaAna = new Conta();
	public Cartao credAna = new Cartao();
	public Cartao debAna = new Cartao();

	public Pessoa filhoAna = new Pessoa();
	public Passaporte passaporteFilhoAna = new Passaporte();

	public List<Cartao> cartoesCredito = new ArrayList<Cartao>();
	public List<Cartao> cartoesDebito = new ArrayList<>();
	public List<Conta> contas = new ArrayList<>();
	public List<Pessoa> pessoas = new ArrayList<>();

	/**
	 * Construtor que inicializa o objeto ContasTestes e dá valores para os
	 * atributos.
	 */
	public ContasTestes() {

		passaporteAna.setNumPassaporte("1111");
		passaporteAna.setPaisEmissor("Brasil");
		passaporteAna.setStatusPassaporte(true);
		ana.setNome("Ana Maria");
		ana.setConta(contaAna);
		ana.setCpf("22222");
		ana.setPassaporte(passaporteAna);
		ana.setDataDeNascimento(LocalDateTime.of(1984, 8, 8, 0, 0));
		pessoas.add(ana);

		contaAna.setNomeTitular("Ana Maria");
		contaAna.setNumero(1654631);
		contaAna.setSaldo(5784.6);
		contaAna.setTipo("Conta Corrente");
		contas.add(contaAna);

		credAna.setConta(contaAna);
		credAna.setNumero(12345);
		credAna.setTipo(TipoCartao.CRED);
		credAna.setLimite(2000.0);
		credAna.setLimiteDisponivel(2000.0);
		credAna.setSenha(1230);
		cartoesCredito.add(credAna);

		debAna.setConta(contaAna);
		debAna.setNumero(12345);
		debAna.setTipo(TipoCartao.DEB);
		debAna.setLimite(2000.0);
		debAna.setLimiteDisponivel(2000.0);
		debAna.setSenha(12345);
		cartoesDebito.add(debAna);

		passaporteFilhoAna.setNumPassaporte("11");
		passaporteFilhoAna.setPaisEmissor("Brasil");
		passaporteFilhoAna.setStatusPassaporte(true);

		filhoAna.setNome("Joaozinho");
		filhoAna.setPassaporte(passaporteFilhoAna);
		filhoAna.setCpf("33333");
		filhoAna.setDataDeNascimento(LocalDateTime.of(2015, 1, 2, 0, 0));
		pessoas.add(filhoAna);

	}

	/**
	 * Método que verifica se uma pessoa existe a partir do parâmetro cpf,
	 * retornando um boolean.
	 * 
	 * @param cpf
	 * @return
	 */
	public boolean pessoaExiste(String cpf) {
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				return true;
			}
		}

		return false;
	}

	/**
	 * Método que insere um objeto Pessoa na lista de pessoas, retornando um
	 * boolean.
	 * 
	 * @param pessoa
	 * @return
	 */
	public boolean inserePessoa(Pessoa pessoa) {

		if (!this.pessoas.contains(pessoa)) {
			this.pessoas.add(pessoa);
			return true;
		} else {
			return false;
		}
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

}
