package br.edu.infnet.apptalesauto.model.service;

import br.edu.infnet.apptalesauto.model.domain.Concessionaria;
import br.edu.infnet.apptalesauto.model.domain.Venda;
import br.edu.infnet.apptalesauto.model.domain.Vendedor;
import br.edu.infnet.apptalesauto.model.domain.dto.VendedorDTO;
import br.edu.infnet.apptalesauto.model.repository.ConcessionariaRepository;
import br.edu.infnet.apptalesauto.model.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendedorService {

    @Autowired
    private VendedorRepository vendedorRepository;

    @Autowired
    private ConcessionariaRepository concessionariaRepository;

    public void incluir(VendedorDTO vendedorDTO) {
        Concessionaria concessionaria = concessionariaRepository.findById(vendedorDTO.getIdConcessionaria()).orElse(null);
         Vendedor vendedor = new Vendedor(vendedorDTO.getNome(), vendedorDTO.getIdade(), vendedorDTO.getSalario(), concessionaria);
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
