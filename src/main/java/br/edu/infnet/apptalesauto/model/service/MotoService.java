package br.edu.infnet.apptalesauto.model.service;

import br.edu.infnet.apptalesauto.model.domain.Carro;
import br.edu.infnet.apptalesauto.model.domain.Concessionaria;
import br.edu.infnet.apptalesauto.model.domain.Moto;
import br.edu.infnet.apptalesauto.model.domain.dto.MotoDTO;
import br.edu.infnet.apptalesauto.model.repository.ConcessionariaRepository;
import br.edu.infnet.apptalesauto.model.repository.MotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MotoService {

    @Autowired
    private MotoRepository motoRepository;

    @Autowired
    private ConcessionariaRepository concessionariaRepository;

    public void incluir(MotoDTO motoDTO) {
        Concessionaria concessionaria = concessionariaRepository.findById(motoDTO.getIdConcessionaria()).orElse(null);
        Moto moto = new Moto(motoDTO.getMarca(), motoDTO.getModelo(), motoDTO.getAno(), motoDTO.getPreco(), motoDTO.isTemPartidaEletrica(), concessionaria);
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

    public Iterable<Moto> obterListaOrdenada(String orderBy) {
        return motoRepository.findAll(Sort.by(Sort.Direction.ASC, orderBy));
    }

    public Collection<Moto> obterComPartidaEletrica(boolean cPartidaEletrica) {
        return motoRepository.findByTemPartidaEletrica(cPartidaEletrica);
    }
}
