package br.edu.infnet.apptalesauto.model.service;

import br.edu.infnet.apptalesauto.model.domain.Carro;
import br.edu.infnet.apptalesauto.model.domain.Concessionaria;
import br.edu.infnet.apptalesauto.model.repository.ConcessionariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConcessionariaService {

    @Autowired
    private ConcessionariaRepository concessionariaRepository;

    public void incluir(Concessionaria concessionaria) {
        concessionariaRepository.save(concessionaria);
    }

    public Iterable<Concessionaria> obterLista() {
        return concessionariaRepository.findAll();
    }

    public Concessionaria obterPorId(Long id) {
        return concessionariaRepository.findById(id).orElse(null);
    }

    public void excluir(Long id) {
        concessionariaRepository.deleteById(id);
    }

    public long obterQuantidade() {
        return concessionariaRepository.count();
    }
}
