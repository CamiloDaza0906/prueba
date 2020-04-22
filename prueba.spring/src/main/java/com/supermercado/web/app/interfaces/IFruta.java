package com.supermercado.web.app.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.supermercado.web.app.modelo.Fruta;

@Repository
public interface IFruta extends CrudRepository<Fruta, Integer>{
	
	

}
