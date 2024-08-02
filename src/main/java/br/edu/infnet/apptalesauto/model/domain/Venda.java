package br.edu.infnet.apptalesauto.model.domain;

import java.time.LocalDate;

public class Venda {

    private Vendedor vendedor;
    private Veiculo veiculo;
    private LocalDate dataVenda;
    private double valor;

    // Construtor, getters e setters
    public Venda(Vendedor vendedor, Veiculo veiculo, LocalDate dataVenda, double valor) {
        this.vendedor = vendedor;
        this.veiculo = veiculo;
        this.dataVenda = dataVenda;
        this.valor = valor;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Venda [vendedor=" + vendedor + ", veiculo=" + veiculo + ", dataVenda=" + dataVenda + ", valor=" + valor + "]";
    }
}
