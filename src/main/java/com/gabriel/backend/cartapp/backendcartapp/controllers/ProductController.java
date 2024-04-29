package com.gabriel.backend.cartapp.backendcartapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.backend.cartapp.backendcartapp.models.entities.Product;
import com.gabriel.backend.cartapp.backendcartapp.services.ProductService;

// es un APIRest que devuelve JSON o Datos.

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class ProductController {


    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public List<Product> list() {
        // devuelve la lista y lo convierte a JSON
        return service.findAll();
    }
}
