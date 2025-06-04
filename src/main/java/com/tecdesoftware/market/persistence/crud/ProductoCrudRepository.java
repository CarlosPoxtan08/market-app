package com.tecdesoftware.market.persistence.crud;

import com.tecdesoftware.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

//Metodos abstractos que en otras clases se implementaran mejor
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer>{
}
