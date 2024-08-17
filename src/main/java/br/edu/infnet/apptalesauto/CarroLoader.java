package br.edu.infnet.apptalesauto;

import br.edu.infnet.apptalesauto.model.domain.Carro;
import br.edu.infnet.apptalesauto.model.repository.CarroRepository;
import br.edu.infnet.apptalesauto.model.repository.ConcessionariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class CarroLoader implements ApplicationRunner {

    @Autowired
    private CarroRepository carroRepository;

    @Autowired
    private ConcessionariaRepository concessionariaRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Carro fusca = new Carro("Fusca", "Volkswagen", 1970, 10000, false, concessionariaRepository.findById(1L).orElse(null));
        Carro fordFocus = new Carro("Ford", "focus", 2009, 20000, false, concessionariaRepository.findById(1L).orElse(null));
        Carro toyotaCorolla = new Carro("Toyota", "Corolla", 2020, 80000, true, concessionariaRepository.findById(1L).orElse(null));
        Carro hondaCivic = new Carro("Honda", "Civic", 2019, 75000, false, concessionariaRepository.findById(2L).orElse(null));
        Carro fordFusion = new Carro("Ford", "Fusion", 2018, 90000, true, concessionariaRepository.findById(2L).orElse(null));
        Carro chevroletOnix = new Carro("Chevrolet", "Onix", 2021, 60000, false, concessionariaRepository.findById(3L).orElse(null));
        Carro fiatArgo = new Carro("Fiat", "Argo", 2022, 65000, true, concessionariaRepository.findById(3L).orElse(null));

        carroRepository.save(fusca);
        carroRepository.save(fordFocus);
        carroRepository.save(toyotaCorolla);
        carroRepository.save(hondaCivic);
        carroRepository.save(fordFusion);
        carroRepository.save(chevroletOnix);
        carroRepository.save(fiatArgo);

    }
}
