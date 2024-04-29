package com.gabriel.backend.cartapp.backendcartapp.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gabriel.backend.cartapp.backendcartapp.models.entities.Product;
import com.gabriel.backend.cartapp.backendcartapp.repositories.ProductRepository;

// Clase que maneja logica de negocios
// se pone la anotacion de Service
@Service
public class ProductServiceImpl implements ProductService{


    @Autowired
    private ProductRepository repository;

    @Override
    @Transactional(readOnly = true ) 
    public List<Product> findAll() {
        
        return (List<Product>) repository.findAll();
    }



}
