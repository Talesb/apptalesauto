package br.edu.infnet.apptalesauto.model.repository;

import br.edu.infnet.apptalesauto.model.domain.Carro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends CrudRepository<Carro, Long> {
}
