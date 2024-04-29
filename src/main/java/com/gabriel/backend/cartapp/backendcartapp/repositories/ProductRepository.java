package com.gabriel.backend.cartapp.backendcartapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.gabriel.backend.cartapp.backendcartapp.models.entities.Product;

// Se crea el repositorio, recibiendo la tabla y el tipo de dato de la llave primaria.
// accede a una fuente de datos solamente
public interface ProductRepository extends CrudRepository<Product, Long> {

}
