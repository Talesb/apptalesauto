package br.edu.infnet.apptalesauto.model.domain.dto;

public class VendedorDTO {

    private String nome;
    private int idade;
    private double salario;
    private Long idConcessionaria;

    public VendedorDTO(String nome, int idade, double salario, Long idConcessionaria) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.idConcessionaria = idConcessionaria;
    }

    public VendedorDTO() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Long getIdConcessionaria() {
        return idConcessionaria;
    }

    public void setIdConcessionaria(Long idConcessionaria) {
        this.idConcessionaria = idConcessionaria;
    }
}
