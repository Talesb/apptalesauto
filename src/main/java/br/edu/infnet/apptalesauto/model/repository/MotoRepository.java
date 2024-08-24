package br.edu.infnet.apptalesauto.model.repository;

import br.edu.infnet.apptalesauto.model.domain.Carro;
import br.edu.infnet.apptalesauto.model.domain.Concessionaria;
import br.edu.infnet.apptalesauto.model.domain.Moto;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface MotoRepository extends CrudRepository<Moto, Long> {

    Collection<Moto> findByTemPartidaEletrica(boolean cPartidaEletrica);

    Collection<Moto> findAll(Sort orderBy);
}
