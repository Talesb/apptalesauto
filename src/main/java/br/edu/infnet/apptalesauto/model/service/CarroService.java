package br.edu.infnet.apptalesauto.model.service;

import br.edu.infnet.apptalesauto.model.domain.Carro;
import br.edu.infnet.apptalesauto.model.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public void incluir(Carro carro) {
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
