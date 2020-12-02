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
public class Passaporte {
    private String paisEmissor;
    private String numPassaporte;
    private boolean statusPassaporte;

    public Passaporte(String paisEmissor, String numPassaporte, boolean statusPassaporte) {
        this.paisEmissor = paisEmissor;
        this.numPassaporte = numPassaporte;
        this.statusPassaporte = statusPassaporte;
    }

    public String getPaisEmissor() {
        return paisEmissor;
    }

    public void setPaisEmissor(String paisEmissor) {
        this.paisEmissor = paisEmissor;
    }

    public String getNumPassaporte() {
        return numPassaporte;
    }

    public void setNumPassaporte(String numPassaporte) {
        this.numPassaporte = numPassaporte;
    }

    public boolean isStatusPassaporte() {
        return statusPassaporte;
    }

    public void setStatusPassaporte(boolean statusPassaporte) {
        this.statusPassaporte = statusPassaporte;
    }
    
}
