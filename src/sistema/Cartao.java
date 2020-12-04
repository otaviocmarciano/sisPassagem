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
    private String numero;
    private TipoCartao tipo;
    private double limite;
    private double limiteDisponivel;
    
    public Cartao() {
  
    }
    
    public Cartao(Conta conta, String numero, TipoCartao tipo) {
        this.conta = conta;
        this.numero = numero;
        this.tipo = tipo;
    }

    public Cartao(Conta conta, String numero, TipoCartao tipo, double limite) {
        if (this.tipo == TipoCartao.CRED) {
           
            this.conta = conta;
            this.numero = numero;
            this.tipo = tipo;
            this.limite = limite;
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

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean compraDebito(double valor, String local) {
        
        if(conta.realizaCompra(local, valor)){
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "[SALDO INSUFICIENTE]","Saldo insuficiente",0);
        }
        return false;
    }
    

}
