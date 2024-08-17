package br.edu.infnet.apptalesauto.model.repository;

import br.edu.infnet.apptalesauto.model.domain.Concessionaria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConcessionariaRepository extends CrudRepository<Concessionaria, Long> {
}
