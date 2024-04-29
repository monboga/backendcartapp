package com.gabriel.backend.cartapp.backendcartapp.services;

import java.util.List;

import com.gabriel.backend.cartapp.backendcartapp.models.entities.Product;

// implementacion de metodos y que tipo de fuentes de datos
public interface ProductService {

    List<Product> findAll();

}
