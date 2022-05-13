package mx.com.gm.dao;

import mx.com.gm.domain.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaDao extends CrudRepository<Persona, Long>{
    
}
