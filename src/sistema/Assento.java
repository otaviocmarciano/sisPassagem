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
public class Assento {
    private boolean status = false;
    private String posicao;

    public Assento(boolean status, String posicao) {
        this.status = status;
        this.posicao = posicao;
    }

    public String isStatus() {
    	if(status == true) {
    		return "Assento ocupado!";
    	} else {
    		return "Assento desocupado!";
    	}
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    
    
}
