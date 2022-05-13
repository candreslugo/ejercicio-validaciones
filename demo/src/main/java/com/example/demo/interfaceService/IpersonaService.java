package com.example.demo.interfaceService;

import com.example.springcrud_bd.modelo.Persona;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IpersonaService {

    public List<Persona> listar();
    public Optional<Persona> listarID(int id);
    public int save(Persona p);
    public void delete(int id);
}
