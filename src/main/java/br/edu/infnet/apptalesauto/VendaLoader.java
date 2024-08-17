package br.edu.infnet.apptalesauto;

import br.edu.infnet.apptalesauto.model.domain.dto.VendaDTO;
import br.edu.infnet.apptalesauto.model.repository.CarroRepository;
import br.edu.infnet.apptalesauto.model.repository.VendaRepository;
import br.edu.infnet.apptalesauto.model.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(5)
public class VendaLoader implements ApplicationRunner {

    @Autowired
    private VendaService vendaService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        VendaDTO vendaDTO = new VendaDTO(1L, 1L, 10000.);
        VendaDTO vendaDTO2 = new VendaDTO(2L, 2L, 20000.);
        VendaDTO vendaDTO3 = new VendaDTO(3L, 3L, 80000.);
        VendaDTO vendaDTO4 = new VendaDTO(1L, 4L, 75000.);
        VendaDTO vendaDTO5 = new VendaDTO(2L, 5L, 90000.);

        vendaService.incluir(vendaDTO);
        vendaService.incluir(vendaDTO2);
        vendaService.incluir(vendaDTO3);
        vendaService.incluir(vendaDTO4);
        vendaService.incluir(vendaDTO5);

    }
}
