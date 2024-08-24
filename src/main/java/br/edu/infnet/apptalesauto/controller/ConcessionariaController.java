package br.edu.infnet.apptalesauto.controller;

import br.edu.infnet.apptalesauto.model.domain.Carro;
import br.edu.infnet.apptalesauto.model.domain.Concessionaria;
import br.edu.infnet.apptalesauto.model.domain.dto.ConcessionariaDTO;
import br.edu.infnet.apptalesauto.model.service.CarroService;
import br.edu.infnet.apptalesauto.model.service.ConcessionariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ConcessionariaController {

    @Autowired
    private ConcessionariaService concessionariaService;

    @GetMapping(value = "concessionaria/listar")
    public Iterable<Concessionaria> obterLista() {
        return concessionariaService.obterLista();
    }

    @GetMapping(value = "concessionaria/{id}")
    public Concessionaria obterPorId(@PathVariable Long id) {
        return concessionariaService.obterPorId(id);
    }

    @PostMapping(value = "concessionaria/incluir")
    public String incluir(@Valid @RequestBody ConcessionariaDTO concessionaria) {

        try {
            concessionariaService.incluir(concessionaria);
        } catch (Exception e) {
            return "Erro ao incluir a concessionaria: " + e.getMessage();
        }

        return "A inclusão do " + concessionaria + " foi realizada com sucesso!!!";
    }

    @DeleteMapping(value = "concessionaria/{id}/excluir")
    public String excluir(@PathVariable Long id) {

        concessionariaService.excluir(id);

        return "A exclusão do id " + id + " foi realizada com sucesso!!!";
    }
}
