package br.edu.infnet.apptalesauto.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TMoto")
public class Moto extends Veiculo {

    private boolean temPartidaEletrica;

    public Moto(String marca, String modelo, int ano, double preco, boolean temPartidaEletrica, Concessionaria concessionaria) {
        super(marca, modelo, ano, preco, concessionaria);
        this.temPartidaEletrica = temPartidaEletrica;
    }

    public Moto() {
    }

    public Moto(Long id) {
        super(id);
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
