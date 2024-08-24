package br.edu.infnet.apptalesauto.controller;

import br.edu.infnet.apptalesauto.model.domain.Carro;
import br.edu.infnet.apptalesauto.model.domain.dto.CarroDTO;
import br.edu.infnet.apptalesauto.model.service.CarroService;
import org.hibernate.query.QueryParameter;
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
public class CarroController {

    @Autowired
    private CarroService carroService;

    @GetMapping(value = "carro/listar")
    public Iterable<Carro> obterLista() {
        return carroService.obterLista();
    }

    @GetMapping(value = "carro/{id}")
    public Carro obterPorId(@PathVariable Long id) {
        return carroService.obterPorId(id);
    }

    @PostMapping(value = "carro/incluir")
    public String incluir(@Valid @RequestBody CarroDTO carro) {

        carroService.incluir(carro);

        return "A inclusão do " + carro + " foi realizada com sucesso!!!";
    }

    @DeleteMapping(value = "carro/{id}/excluir")
    public String excluir(@PathVariable Long id) {

        carroService.excluir(id);

        return "A exclusão do id " + id + " foi realizada com sucesso!!!";
    }
}
