/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import javax.swing.JOptionPane;

/**
 *
 * @author Otávio Camargo Marciano - 201900244
 */
public class Cartao {

    private Conta conta;
    private int numero;
    private TipoCartao tipo;
    private double limite;
    private double limiteDisponivel; //limite disponivel para compra credito
    private int senha;
    
    public Cartao() {
  
    }
    
    public Cartao(Conta conta, int numero, TipoCartao tipo) {
        this.conta = conta;
        this.numero = numero;
        this.tipo = tipo;
    }

    public Cartao(Conta conta, int numero, TipoCartao tipo, double limite) {
        if (this.tipo == TipoCartao.CRED) {
           
            this.conta = conta;
            this.numero = numero;
            this.tipo = tipo;
            this.setLimite(limite);
        }else{
            JOptionPane.showMessageDialog(null, String.format("[CARTÃO DE DÉBITO NÃO POSSUI O ATRIBUTO LIMITE]\n[UM CARTÃO DE DÉBITO FOI CRIADO]", ""),"Aviso",2);
            this.conta = conta;
            this.numero = numero;
            this.tipo = TipoCartao.DEB;
        }

    }
    

    public String getTipo() {
        return tipo.getTipo();
    }
    public void setTipo(TipoCartao tipo) {
		this.tipo = tipo;
    }
    public Conta getConta() {
        return conta;
    }
    public void setConta(Conta conta) {
        this.conta = conta;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public void setLimiteDisponivel(double limiteDisponivel) {
		this.limiteDisponivel = limiteDisponivel;
	}
	public double getLimiteDisponivel() {
		return limiteDisponivel;
	}

	
    public boolean compraDebito(double valor, String local) {
        
        if(conta.realizaCompra(local, valor)){
        	System.out.println("Compra bem sucedida!");
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "[SALDO INSUFICIENTE]","Saldo insuficiente",0);
        }
        return false;
    }
    
    public boolean compraCredito(String titular, int numero, double valor, String local) {
       
    	if (limiteDisponivel >= valor) {
            conta.realizaCompra(local, valor);
            System.out.println("Compra bem sucedida!");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "[LIMITE ATINGIDO]","Limite atingido",0);
            return false;
        }
    }
    
    public boolean autentica(String titular, int numero, int senha) {
		if(this.senha == senha && this.numero == numero && this.conta.getNomeTitular() == titular) {
			return true;
		} else {
			System.out.println("Dados Invalidos!");
			return false;
		}
	}

}
