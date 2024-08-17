package br.edu.infnet.apptalesauto.model.domain;

public class VendaDTO {

    private Long vendedorId;

    private Long veiculoId;

    private double valor;

    public VendaDTO() {
    }

    public VendaDTO(Long vendedorId, Long veiculoId, double valor) {
        this.vendedorId = vendedorId;
        this.veiculoId = veiculoId;
        this.valor = valor;
    }

    public Long getVendedorId() {
        return vendedorId;
    }

    public void setVendedorId(Long vendedorId) {
        this.vendedorId = vendedorId;
    }

    public Long getVeiculoId() {
        return veiculoId;
    }

    public void setVeiculoId(Long veiculoId) {
        this.veiculoId = veiculoId;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
