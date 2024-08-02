package br.edu.infnet.apptalesauto.model.domain;

import java.util.ArrayList;
import java.util.List;

public class Concessionaria {
    private String nome;
    private String endereco;
    private List<Veiculo> veiculos = new ArrayList<>();
    private List<Vendedor> vendedores = new ArrayList<>();
    private List<Venda> vendas = new ArrayList<>();

    public Concessionaria(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void addVeiculo(Veiculo veiculo) {
        this.veiculos.add(veiculo);
    }

    public List<Vendedor> getVendedores() {
        return vendedores;
    }

    public void addVendedor(Vendedor vendedor) {
        this.vendedores.add(vendedor);
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void addVenda(Venda venda) {
        this.vendas.add(venda);
    }

    @Override
    public String toString() {
        return "Concessionaria [nome=" + nome + ", endereco=" + endereco + ", veiculos=" + veiculos + ", vendedores=" + vendedores + ", vendas=" + vendas + "]";
    }
}
