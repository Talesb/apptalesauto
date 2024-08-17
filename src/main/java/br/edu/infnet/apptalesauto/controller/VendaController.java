package br.edu.infnet.apptalesauto.controller;

import br.edu.infnet.apptalesauto.model.domain.Venda;
import br.edu.infnet.apptalesauto.model.domain.dto.VendaDTO;
import br.edu.infnet.apptalesauto.model.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VendaController {


    @Autowired
    private VendaService vendaService;

    @GetMapping(value = "venda/listar")
    public Iterable<Venda> obterLista() {
        return vendaService.obterLista();
    }

    @GetMapping(value = "venda/{id}")
    public Venda obterPorId(@PathVariable Long id) {
        return vendaService.obterPorId(id);
    }

    @PostMapping(value = "venda/incluir")
    public String incluir(@RequestBody VendaDTO venda) {

        vendaService.incluir(venda);

        return "A inclusão da " + venda + " foi realizada com sucesso!!!";
    }

    @DeleteMapping(value = "venda/{id}/excluir")
    public String excluir(@PathVariable Long id) {

        vendaService.excluir(id);

        return "A exclusão do id " + id + " foi realizada com sucesso!!!";
    }


}
