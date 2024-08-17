package br.edu.infnet.apptalesauto.model.domain.dto;

public record CarroDTO(String marca, String modelo, int ano, double preco, boolean temArCondicionado, Long idConcessionaria) {
}
