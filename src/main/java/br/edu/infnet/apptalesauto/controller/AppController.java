package br.edu.infnet.apptalesauto.controller;

import br.edu.infnet.apptalesauto.model.service.CarroService;
import br.edu.infnet.apptalesauto.model.service.ConcessionariaService;
import br.edu.infnet.apptalesauto.model.service.MotoService;
import br.edu.infnet.apptalesauto.model.service.VendaService;
import br.edu.infnet.apptalesauto.model.service.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @Autowired
    ConcessionariaService concessionariaService;

    @Autowired
    CarroService carroService;

    @Autowired
    MotoService motoService;

    @Autowired
    VendedorService vendedorService;

    @Autowired
    VendaService vendaService;

    @GetMapping(value = "/")
    public String telaHome(Model model) {

        model.addAttribute("qtdeConcessionaria", concessionariaService.obterQuantidade());
        model.addAttribute("qtdCarro", carroService.obterQuantidade());
        model.addAttribute("qtdeMoto", motoService.obterQuantidade());
        model.addAttribute("qtdeVendedor", vendedorService.obterQuantidade());
        model.addAttribute("qtdeVenda", vendaService.obterQuantidade());

        return "home";
    }

    @GetMapping(value = "/concessionaria/listagem")
    public String listarConcessionaria(Model model) {

        model.addAttribute("titulo", "Listagem de Concessionárias");
        model.addAttribute("listagem", concessionariaService.obterLista());

        return telaHome(model);
    }

    @GetMapping(value = "/carro/listagem")
    public String listarCarro(Model model) {

        model.addAttribute("titulo", "Listagem de Carros");
        model.addAttribute("listagem", carroService.obterLista());

        return telaHome(model);
    }

    @GetMapping(value = "/moto/listagem")
    public String listarMoto(Model model) {

        model.addAttribute("titulo", "Listagem de Motos");
        model.addAttribute("listagem", motoService.obterLista());

        return telaHome(model);
    }

    @GetMapping(value = "/vendedor/listagem")
    public String listarVendedor(Model model) {

        model.addAttribute("titulo", "Listagem de Vendedores");
        model.addAttribute("listagem", vendedorService.obterLista());

        return telaHome(model);
    }

    @GetMapping(value = "/venda/listagem")
    public String listarVenda(Model model) {

        model.addAttribute("titulo", "Listagem de Vendas");
        model.addAttribute("listagem", vendaService.obterLista());

        return telaHome(model);
    }

}
