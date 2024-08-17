package br.edu.infnet.apptalesauto.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TCarro")
public class Carro extends Veiculo {
    private boolean temArCondicionado;

    public Carro(String marca, String modelo, int ano, double preco, boolean temArCondicionado, Concessionaria concessionaria) {
        super(marca, modelo, ano, preco, concessionaria);
        this.temArCondicionado = temArCondicionado;
    }

    public Carro() {
    }

    public Carro(Long id) {
        super(id);
    }

    public boolean isTemArCondicionado() {
        return temArCondicionado;
    }

    public void setTemArCondicionado(boolean temArCondicionado) {
        this.temArCondicionado = temArCondicionado;
    }

    @Override
    public String toString() {
        return super.toString() + "temArCondicionado=" + temArCondicionado ;
    }
}
