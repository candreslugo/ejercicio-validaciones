package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.domain.Persona;
import org.springframework.stereotype.Service;

@Service
public interface PersonaService {
    
    public List<Persona> listarPersonas();
    
    public void guardar(Persona persona);
    
    public void eliminar(Persona persona);
    
    public Persona encontrarPersona(Persona persona);
}
