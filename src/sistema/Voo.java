/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistema;

import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author Otávio Camargo Marciano - 201900244
 */
public class Voo {
    private Assento assentosVoo[][];
    private Aviao aviao;
    private LocalDateTime horaDeSaida;
    private LocalDateTime horaDeChegada;
    private List<Cidade> paradas;
    private Cidade destino;

    public Voo(Assento[][] assentosVoo, Aviao aviao, LocalDateTime horaDeSaida, LocalDateTime horaDeChegada, List<Cidade> paradas, Cidade destino) {
        this.assentosVoo = assentosVoo;
        this.aviao = aviao;
        this.horaDeSaida = horaDeSaida;
        this.horaDeChegada = horaDeChegada;
        this.paradas = paradas;
        this.destino = destino;
    }

    public Assento[][] getAssentosVoo() {
        return assentosVoo;
    }

    public void setAssentosVoo(Assento[][] assentosVoo) {
        this.assentosVoo = assentosVoo;
    }

    public Aviao getAviao() {
        return aviao;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }

    public LocalDateTime getHoraDeSaida() {
        return horaDeSaida;
    }

    public void setHoraDeSaida(LocalDateTime horaDeSaida) {
        this.horaDeSaida = horaDeSaida;
    }

    public LocalDateTime getHoraDeChegada() {
        return horaDeChegada;
    }

    public void setHoraDeChegada(LocalDateTime horaDeChegada) {
        this.horaDeChegada = horaDeChegada;
    }

    public List<Cidade> getParadas() {
        return paradas;
    }

    public void setParadas(List<Cidade> paradas) {
        this.paradas = paradas;
    }

    public Cidade getDestino() {
        return destino;
    }

    public void setDestino(Cidade destino) {
        this.destino = destino;
    }
    

}
