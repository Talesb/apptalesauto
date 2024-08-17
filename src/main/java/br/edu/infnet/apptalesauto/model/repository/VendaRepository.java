package br.edu.infnet.apptalesauto.model.repository;

import br.edu.infnet.apptalesauto.model.domain.Concessionaria;
import br.edu.infnet.apptalesauto.model.domain.Venda;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends CrudRepository<Venda, Long> {
}
