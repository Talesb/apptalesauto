package br.edu.infnet.apptalesauto.model.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "TMoto")
public class Moto extends Veiculo {

    private boolean temPartidaEletrica;

    public Moto(String marca, String modelo, int ano, double preco, boolean temPartidaEletrica) {
        super(marca, modelo, ano, preco);
        this.temPartidaEletrica = temPartidaEletrica;
    }

    public Moto() {
    }

    public boolean isTemPartidaEletrica() {
        return temPartidaEletrica;
    }

    public void setTemPartidaEletrica(boolean temPartidaEletrica) {
        this.temPartidaEletrica = temPartidaEletrica;
    }

    @Override
    public String toString() {
        return super.toString() + " Moto [temPartidaEletrica=" + temPartidaEletrica + "]";
    }
}
