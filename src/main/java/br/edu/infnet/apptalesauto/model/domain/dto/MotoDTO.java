package br.edu.infnet.apptalesauto.model.domain.dto;

public record MotoDTO (String marca, String modelo, int ano, double preco, boolean temPartidaEletrica, Long idConcessionaria) {
}
