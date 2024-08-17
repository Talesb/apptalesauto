package br.edu.infnet.apptalesauto.model.service;

import br.edu.infnet.apptalesauto.model.domain.Carro;
import br.edu.infnet.apptalesauto.model.domain.Concessionaria;
import br.edu.infnet.apptalesauto.model.domain.dto.CarroDTO;
import br.edu.infnet.apptalesauto.model.repository.CarroRepository;
import br.edu.infnet.apptalesauto.model.repository.ConcessionariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    @Autowired
    private ConcessionariaRepository concessionariaRepository;

    public void incluir(CarroDTO carroDTO) {
        Concessionaria concessionaria = concessionariaRepository.findById(carroDTO.getIdConcessionaria()).orElse(null);
        Carro carro = new Carro(carroDTO.getMarca(),carroDTO.getModelo(),carroDTO.getAno(),carroDTO.getPreco(),carroDTO.isTemArCondicionado(),concessionaria);
        carroRepository.save(carro);
    }

    public Iterable<Carro> obterLista() {
        return carroRepository.findAll();
    }

    public Carro obterPorId(Long id) {
        return carroRepository.findById(id).orElse(null);
    }

    public void excluir(Long id) {
        carroRepository.deleteById(id);
    }

    public long obterQuantidade() {
        return carroRepository.count();
    }
}
