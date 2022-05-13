package com.example.demo.modelo;


import javax.persistence.*;


@Entity
@Table(name = "persona")
public class Persona {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Persona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    public Persona() {
    }

    public Persona(int id_Persona, String nombre, String apellido, String email, String telefono) {
        this.id_Persona = id_Persona;
        this.nombre = nombre;
        this.apellido = apellido;

    }

    public int getId_Persona() {
        return id_Persona;
    }

    public void setId_Persona(int id_Persona) {
        this.id_Persona = id_Persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id_Persona=" + id_Persona +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}


