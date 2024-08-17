package br.edu.infnet.apptalesauto.model.domain.dto;

public class MotoDTO {

    private String marca;
    private String modelo;
    private int ano;
    private double preco;
    private boolean temPartidaEletrica;
    private Long idConcessionaria;

    public MotoDTO(String marca, String modelo, int ano, double preco, boolean temPartidaEletrica, Long idConcessionaria) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        this.temPartidaEletrica = temPartidaEletrica;
        this.idConcessionaria = idConcessionaria;
    }

    public MotoDTO() {

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

    public boolean isTemPartidaEletrica() {
        return temPartidaEletrica;
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

    public void setTemPartidaEletrica(boolean temPartidaEletrica) {
        this.temPartidaEletrica = temPartidaEletrica;
    }

    public void setIdConcessionaria(Long idConcessionaria) {
        this.idConcessionaria = idConcessionaria;
    }
}
