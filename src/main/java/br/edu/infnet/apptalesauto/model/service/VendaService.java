package br.edu.infnet.apptalesauto.model.service;

import br.edu.infnet.apptalesauto.model.domain.Carro;
import br.edu.infnet.apptalesauto.model.domain.Moto;
import br.edu.infnet.apptalesauto.model.domain.Venda;
import br.edu.infnet.apptalesauto.model.domain.dto.VendaDTO;
import br.edu.infnet.apptalesauto.model.domain.Vendedor;
import br.edu.infnet.apptalesauto.model.repository.CarroRepository;
import br.edu.infnet.apptalesauto.model.repository.MotoRepository;
import br.edu.infnet.apptalesauto.model.repository.VendaRepository;
import br.edu.infnet.apptalesauto.model.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class VendaService {

    @Autowired
    private VendaRepository vendaRepository;

    @Autowired
    private VendedorRepository vendedorRepository;

    @Autowired
    private MotoRepository motoRepository;

    @Autowired
    private CarroRepository carroRepository;

    public void incluir(VendaDTO vendaDTO) {

        Vendedor vendedor = vendedorRepository.findById(vendaDTO.getVendedorId()).orElseThrow( () -> new RuntimeException("Vendedor não encontrado"));

        Optional<Moto> moto = motoRepository.findById(vendaDTO.getVeiculoId());
        Optional<Carro> carro = carroRepository.findById(vendaDTO.getVeiculoId());

        if (moto.isPresent()) {
            vendaRepository.save(new Venda(vendedor, moto.get(), LocalDate.now(), vendaDTO.getValor()));
        } else if (carro.isPresent()) {
            vendaRepository.save(new Venda(vendedor,  carro.get(), LocalDate.now(), vendaDTO.getValor()));
        }

    }

    public Iterable<Venda> obterLista() {
        return vendaRepository.findAll();
    }

    public Venda obterPorId(Long id) {
        return vendaRepository.findById(id).orElse(null);
    }

    public void excluir(Long id) {
        vendaRepository.deleteById(id);
    }

    public long obterQuantidade() {
        return vendaRepository.count();
    }
}
