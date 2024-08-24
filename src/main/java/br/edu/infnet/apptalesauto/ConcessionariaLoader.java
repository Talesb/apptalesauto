package br.edu.infnet.apptalesauto;

import br.edu.infnet.apptalesauto.model.domain.Concessionaria;
import br.edu.infnet.apptalesauto.model.domain.Endereco;
import br.edu.infnet.apptalesauto.model.domain.dto.EnderecoDTO;
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

     EnderecoDTO enderecoFake = new EnderecoDTO("20010-020","Rua São José","","","Centro","Rio de Janeiro","RJ");

        Concessionaria concessionaria = new Concessionaria("Concessionaria do Elberth",new Endereco(enderecoFake) );
        Concessionaria concessionaria2 = new Concessionaria("Concessionaria do Tales", new Endereco(enderecoFake) );
        Concessionaria concessionaria3 = new Concessionaria("Concessionaria dos Testes", new Endereco(enderecoFake) );

        concessionariaRepository.save(concessionaria);
        concessionariaRepository.save(concessionaria2);
        concessionariaRepository.save(concessionaria3);

    }
}
