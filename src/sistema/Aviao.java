/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistema;

/**
 *
 * @author Otávio Camargo Marciano - 201900244
 */
public class Aviao {
    private String modelo;
    private int quantidadeDeAssentos;

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
