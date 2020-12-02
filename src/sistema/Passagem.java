/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Otávio Camargo Marciano - 201900244
 */
public abstract class Passagem {

    private double valor;
    private String id;
    private Pessoa titular;
    private Assento assento;
    private static List<String> ids = new ArrayList<>();

    public Passagem( Pessoa titular, Assento assento) {
       

        this.titular = titular;
        this.assento = assento;
        this.id = geraId();
    }

    private String geraId() {
        Random r = new Random();
        String codigo;
        String letra1, letra2;
        String[] a = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        int n1, n2;
        n:
        for (;;) {
            n1 = r.nextInt(9);
            n2 = r.nextInt(9);
            letra1 = a[r.nextInt(25)];
            letra2 = a[r.nextInt(25)];

            codigo = String.format("%s%s%d%d", letra1, letra2, n1, n2);
            if (!ids.contains(codigo)) {
                ids.add(codigo);
                return codigo;
            }
        }
    }

    public abstract void defineValor();

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public Assento getAssento() {
        return assento;
    }

    public void setAssento(Assento assento) {
        this.assento = assento;
    }

}
