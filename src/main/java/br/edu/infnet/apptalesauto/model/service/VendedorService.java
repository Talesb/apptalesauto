package br.edu.infnet.apptalesauto.model.service;

import br.edu.infnet.apptalesauto.model.domain.Venda;
import br.edu.infnet.apptalesauto.model.domain.Vendedor;
import br.edu.infnet.apptalesauto.model.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendedorService {

    @Autowired
    private VendedorRepository vendedorRepository;

    public void incluir(Vendedor vendedor) {
        vendedorRepository.save(vendedor);
    }

    public Iterable<Vendedor> obterLista() {
        return vendedorRepository.findAll();
    }

    public Vendedor obterPorId(Long id) {
        return vendedorRepository.findById(id).orElse(null);
    }

    public void excluir(Long id) {
        vendedorRepository.deleteById(id);
    }

    public long obterQuantidade() {
        return vendedorRepository.count();
    }

}
