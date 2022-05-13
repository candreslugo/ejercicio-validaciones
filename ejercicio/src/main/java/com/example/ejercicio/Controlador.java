package com.example.ejercicio;


import org.springframework.web.bind.annotation.*;

@RestController
public class Controlador {
public String products;
@RequestMapping("/products")
public String crear(@PathVariable("products") String products ){
    return "este es el metodo para consultar todos los productos";
}



}
