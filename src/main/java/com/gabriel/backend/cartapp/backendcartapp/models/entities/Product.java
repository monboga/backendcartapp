package com.gabriel.backend.cartapp.backendcartapp.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// anotaciones de java
// clase mapeada a una tabla de base de datos
// se crea un paquete models.entities
// la tabla de la base de datos, debe llamarse Product

@Entity
@Table(name="products")
public class Product {

    // toda clase debe tener una llave primaria.
    // Generar un id de forma auto_incrementada
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @Column(name = "name_product") esto es para asignarle un nombre 
    private String name; 

    private String description;

    private Long price;

    // Generacion de metodos Getter y Setters.

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    
    
}
