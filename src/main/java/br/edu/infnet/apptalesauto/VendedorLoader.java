package br.edu.infnet.apptalesauto;

import br.edu.infnet.apptalesauto.model.domain.Vendedor;
import br.edu.infnet.apptalesauto.model.repository.ConcessionariaRepository;
import br.edu.infnet.apptalesauto.model.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(4)
public class VendedorLoader implements ApplicationRunner {

    @Autowired
    private VendedorRepository vendedorRepository;

    @Autowired
    private ConcessionariaRepository concessionariaRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Vendedor joao = new Vendedor("João Silva", 30, 3000.00, concessionariaRepository.findById(1L).orElse(null));
        Vendedor maria = new Vendedor("Maria Souza", 28, 3200.00, concessionariaRepository.findById(1L).orElse(null));
        Vendedor carlos = new Vendedor("Carlos Oliveira", 35, 3500.00, concessionariaRepository.findById(2L).orElse(null));
        Vendedor ana = new Vendedor("Ana Pereira", 26, 2800.00, concessionariaRepository.findById(2L).orElse(null));
        Vendedor pedro = new Vendedor("Pedro Santos", 40, 4000.00, concessionariaRepository.findById(3L).orElse(null));

        vendedorRepository.save(joao);
        vendedorRepository.save(maria);
        vendedorRepository.save(carlos);
        vendedorRepository.save(ana);
        vendedorRepository.save(pedro);
    }
}
