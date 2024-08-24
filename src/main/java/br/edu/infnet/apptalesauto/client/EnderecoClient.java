package br.edu.infnet.apptalesauto.client;

import br.edu.infnet.apptalesauto.model.domain.dto.EnderecoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://viacep.com.br/ws", name = "enderecoClient")
public interface EnderecoClient {

    @GetMapping(value = "/{cep}/json/")
    EnderecoDTO findByCep(@PathVariable String cep);
}
