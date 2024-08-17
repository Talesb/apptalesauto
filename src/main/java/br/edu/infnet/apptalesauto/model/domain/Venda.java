package br.edu.infnet.apptalesauto.model.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.time.LocalDate;


@Entity
@Table(name = "TVenda")
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "idVendedor")
    private Vendedor vendedor;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "veiculo_id", referencedColumnName = "id")
    private Veiculo veiculo;

    private LocalDate dataVenda;
    private double valor;


    public Venda(Vendedor vendedor, Veiculo veiculo, LocalDate dataVenda, double valor) {
        this.vendedor = vendedor;
        this.veiculo = veiculo;
        this.dataVenda = dataVenda;
        this.valor = valor;
    }

    public Venda() {
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return "Venda [vendedor=" + vendedor + ", veiculo=" + veiculo + ", dataVenda=" + dataVenda + ", valor=" + valor + "]";
    }
}
