package br.edu.infnet.apptalesauto.model.service;

import br.edu.infnet.apptalesauto.client.EnderecoClient;
import br.edu.infnet.apptalesauto.model.domain.Concessionaria;
import br.edu.infnet.apptalesauto.model.domain.Endereco;
import br.edu.infnet.apptalesauto.model.domain.dto.ConcessionariaDTO;
import br.edu.infnet.apptalesauto.model.domain.dto.EnderecoDTO;
import br.edu.infnet.apptalesauto.model.repository.ConcessionariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConcessionariaService {

    @Autowired
    private ConcessionariaRepository concessionariaRepository;

    @Autowired
    private EnderecoClient enderecoClient;

    public void incluir(ConcessionariaDTO concessionariaDTO) {

        String cep = concessionariaDTO.getCep();

        try {
            EnderecoDTO enderecoDTO = enderecoClient.findByCep(cep);
            Endereco endereco = new Endereco(enderecoDTO);
            Concessionaria concessionaria = new Concessionaria(concessionariaDTO.getNome(), endereco);
            concessionariaRepository.save(concessionaria);
        } catch (Exception e) {
            throw new RuntimeException("CEP inválido");
        }

    }

    public Iterable<Concessionaria> obterLista() {
        return concessionariaRepository.findAll();
    }

    public Concessionaria obterPorId(Long id) {
        return concessionariaRepository.findById(id).orElse(null);
    }

    public void excluir(Long id) {
        concessionariaRepository.deleteById(id);
    }

    public long obterQuantidade() {
        return concessionariaRepository.count();
    }
}
