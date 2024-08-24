package br.edu.infnet.apptalesauto.model.repository;

import br.edu.infnet.apptalesauto.model.domain.Carro;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface CarroRepository extends CrudRepository<Carro, Long> {

    Collection<Carro> findByTemArCondicionado(boolean cArcondicionado);

    Collection<Carro> findAll(Sort orderBy);
}
