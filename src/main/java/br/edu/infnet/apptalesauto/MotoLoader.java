package br.edu.infnet.apptalesauto;

import br.edu.infnet.apptalesauto.model.domain.Moto;
import br.edu.infnet.apptalesauto.model.repository.ConcessionariaRepository;
import br.edu.infnet.apptalesauto.model.repository.MotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class MotoLoader implements ApplicationRunner {

    @Autowired
    private MotoRepository motoRepository;

    @Autowired
    private ConcessionariaRepository concessionariaRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Moto honda = new Moto("Honda", "CB 500", 2021, 30000, false, concessionariaRepository.findById(1L).orElse(null));
        Moto yamaha = new Moto("Yamaha", "MT 07", 2020, 25000, true, concessionariaRepository.findById(1L).orElse(null));
        Moto kawasaki = new Moto("Kawasaki", "Ninja 300", 2019, 20000, false, concessionariaRepository.findById(2L).orElse(null));
        Moto ducati = new Moto("Ducati", "Monster 1200", 2018, 40000, true, concessionariaRepository.findById(2L).orElse(null));
        Moto bmw = new Moto("BMW", "S 1000 RR", 2022, 50000, false, concessionariaRepository.findById(3L).orElse(null));
        Moto suzuki = new Moto("Suzuki", "GSX 750", 2021, 30000, true, concessionariaRepository.findById(3L).orElse(null));

        motoRepository.save(honda);
        motoRepository.save(yamaha);
        motoRepository.save(kawasaki);
        motoRepository.save(ducati);
        motoRepository.save(bmw);
        motoRepository.save(suzuki);
    }
}
