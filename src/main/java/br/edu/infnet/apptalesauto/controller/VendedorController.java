package br.edu.infnet.apptalesauto.controller;

import br.edu.infnet.apptalesauto.model.domain.Venda;
import br.edu.infnet.apptalesauto.model.domain.Vendedor;
import br.edu.infnet.apptalesauto.model.service.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VendedorController {

    @Autowired
    private VendedorService vendedorService;

    @GetMapping(value = "vendedor/listar")
    public Iterable<Vendedor> obterLista() {
        return vendedorService.obterLista();
    }

    @GetMapping(value = "vendedor/{id}")
    public Vendedor obterPorId(@PathVariable Long id) {
        return vendedorService.obterPorId(id);
    }

    @PostMapping(value = "vendedor/incluir")
    public String incluir(@RequestBody Vendedor vendedor) {

        vendedorService.incluir(vendedor);

        return "A inclusão da " + vendedor + " foi realizada com sucesso!!!";
    }

    @DeleteMapping(value = "vendedor/{id}/excluir")
    public String excluir(@PathVariable Long id) {

        vendedorService.excluir(id);

        return "A exclusão do id " + id + " foi realizada com sucesso!!!";
    }
}
