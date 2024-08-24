package br.edu.infnet.apptalesauto.controller;

import br.edu.infnet.apptalesauto.model.domain.Carro;
import br.edu.infnet.apptalesauto.model.domain.Moto;
import br.edu.infnet.apptalesauto.model.domain.dto.MotoDTO;
import br.edu.infnet.apptalesauto.model.service.MotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class MotoController {

    @Autowired
    private MotoService motoService;

    @GetMapping(value = "moto/listar")
    public Iterable<Moto> obterLista() {
        return motoService.obterLista();
    }


    @GetMapping(value = "moto/{id}")
    public Moto obterPorId(@PathVariable Long id) {
        return motoService.obterPorId(id);
    }

    @PostMapping(value = "moto/incluir")
    public String incluir(@Valid @RequestBody MotoDTO moto) {

        motoService.incluir(moto);

        return "A inclusão do " + moto + " foi realizada com sucesso!!!";
    }

    @DeleteMapping(value = "moto/{id}/excluir")
    public String excluir(@PathVariable Long id) {

        motoService.excluir(id);

        return "A exclusão do id " + id + " foi realizada com sucesso!!!";
    }
}
