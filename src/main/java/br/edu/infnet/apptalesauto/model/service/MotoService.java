package br.edu.infnet.apptalesauto.model.service;

import br.edu.infnet.apptalesauto.model.domain.Concessionaria;
import br.edu.infnet.apptalesauto.model.domain.Moto;
import br.edu.infnet.apptalesauto.model.repository.MotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MotoService {

    @Autowired
    private MotoRepository motoRepository;

    public void incluir(Moto moto) {
        motoRepository.save(moto);
    }

    public Iterable<Moto> obterLista() {
        return motoRepository.findAll();
    }

    public Moto obterPorId(Long id) {
        return motoRepository.findById(id).orElse(null);
    }

    public void excluir(Long id) {
        motoRepository.deleteById(id);
    }

    public long obterQuantidade() {
        return motoRepository.count();
    }
}
