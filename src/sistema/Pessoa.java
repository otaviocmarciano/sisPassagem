/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistema;

import java.util.Date;

/**
 *
 * @author Otávio Camargo Marciano - 201900244
 */
public class Pessoa {
    private String nome;
    private String cpf;
    private Conta conta;
    private Date dataDeNascimento;
    private Passaporte passaporte;

    public Pessoa(String nome, String cpf, Date dataDeNascimento, Passaporte passaporte) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
        this.passaporte = passaporte;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Passaporte getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(Passaporte passaporte) {
        this.passaporte = passaporte;
    }
    
//    public boolean compraDebito(double valor, String local){
//        this.conta.getCartao().compraDebito(local,valor,Conta);
//   }
    

}
