package com.example.demo.interfaces;

import com.example.springcrud_bd.modelo.Persona;
import org.springframework.data.repository.CrudRepository;

public interface IPersona extends CrudRepository<Persona,Integer> {

}
