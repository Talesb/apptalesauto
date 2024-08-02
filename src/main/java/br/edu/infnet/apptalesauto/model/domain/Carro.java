package br.edu.infnet.apptalesauto.model.domain;

public class Carro extends Veiculo {
    private boolean temArCondicionado;

    public Carro(String marca, String modelo, int ano, double preco, boolean temArCondicionado) {
        super(marca, modelo, ano, preco);
        this.temArCondicionado = temArCondicionado;
    }

    public boolean isTemArCondicionado() {
        return temArCondicionado;
    }

    public void setTemArCondicionado(boolean temArCondicionado) {
        this.temArCondicionado = temArCondicionado;
    }

    @Override
    public String toString() {
        return super.toString() + " Carro [temArCondicionado=" + temArCondicionado + "]";
    }
}
