package sistema;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;

public class ContasTestes {
    
    public Pessoa ana = new Pessoa();
    public Passaporte passaporteAna = new Passaporte();
    public Conta contaAna = new Conta();
    public Cartao credAna = new Cartao();
    public Cartao debAna = new Cartao();
    
    public Pessoa filhoAna = new Pessoa();
    public Passaporte passaporteFilhoAna = new Passaporte();
    
    public Conta contaJoao = new Conta();
    public Cartao cartaoJoao = new Cartao();
    
    public Conta contaHenrique = new Conta();
    public Cartao cartaoHenrique = new Cartao();
    
    public List<Cartao> cartoesCredito = new ArrayList<Cartao>();
    public List<Cartao> cartoesDebito = new ArrayList<>();
    public List<Conta> contas = new ArrayList<>();
    public List<Pessoa> pessoas = new ArrayList<>();
    
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
        
        contaJoao.setNomeTitular("Joao Otavio");
        contaJoao.setNumero(135465);
        contaJoao.setSaldo(300.0);
        contaJoao.setTipo("Conta Corrente");
        
        contaHenrique.setNomeTitular("Henrique Campos");
        contaHenrique.setNumero(76513);
        contaHenrique.setSaldo(2800.53);
        contaHenrique.setTipo("Conta Corrente");
        
    }

    public boolean pessoaExiste(String cpf) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                return true;
            }
        }
        
        return false;
    }
    
    public List<Pessoa> getPessoas() {
        return pessoas;
    }
    
    public boolean inserePessoa(Pessoa pessoa) {
        
        if (!this.pessoas.contains(pessoa)) {
            this.pessoas.add(pessoa);
            return true;
        } else {
            return false;
        }
    }
    
}
