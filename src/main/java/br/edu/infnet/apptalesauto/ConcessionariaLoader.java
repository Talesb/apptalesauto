package br.edu.infnet.apptalesauto;

import br.edu.infnet.apptalesauto.model.domain.Concessionaria;
import br.edu.infnet.apptalesauto.model.repository.ConcessionariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class ConcessionariaLoader implements ApplicationRunner {

    @Autowired
    ConcessionariaRepository concessionariaRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Concessionaria concessionaria = new Concessionaria("Concessionaria do Elberth", "Rua das Laranjeiras");
        Concessionaria concessionaria2 = new Concessionaria("Concessionaria do Tales", "Rua Almirante Barroso");
        Concessionaria concessionaria3 = new Concessionaria("Concessionaria dos Testes", "Intendente Magalhães");

        concessionariaRepository.save(concessionaria);
        concessionariaRepository.save(concessionaria2);
        concessionariaRepository.save(concessionaria3);

    }
}
