package br.edu.infnet.apptalesauto.model.domain.dto;

public class CarroDTO {

   private String marca;
    private String modelo;
    private int ano;
    private double preco;
    private boolean temArCondicionado;
    private Long idConcessionaria;

    public CarroDTO(String marca, String modelo, int ano, double preco, boolean temArCondicionado, Long idConcessionaria) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        this.temArCondicionado = temArCondicionado;
        this.idConcessionaria = idConcessionaria;
    }

    public CarroDTO() {

    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isTemArCondicionado() {
        return temArCondicionado;
    }

    public Long getIdConcessionaria() {
        return idConcessionaria;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setTemArCondicionado(boolean temArCondicionado) {
        this.temArCondicionado = temArCondicionado;
    }

    public void setIdConcessionaria(Long idConcessionaria) {
        this.idConcessionaria = idConcessionaria;
    }
}
