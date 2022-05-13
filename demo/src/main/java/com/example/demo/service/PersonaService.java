package com.example.demo.service;

import com.example.springcrud_bd.interfaceService.IpersonaService;
import com.example.springcrud_bd.interfaces.IPersona;
import com.example.springcrud_bd.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements IpersonaService {

    @Autowired
    private IPersona data;

    @Override
    public List<Persona> listar() {
        return (List<Persona>) data.findAll();
    }

    @Override
    public Optional<Persona> listarID(int id) {
        return null;
    }

    @Override
    public int save(Persona p) {
        return 0;
    }

    @Override
    public void delete(int id) {

    }
}
