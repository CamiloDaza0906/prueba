package com.supermercado.web.app.interfaceService;

import java.util.List;
import java.util.Optional;

import com.supermercado.web.app.modelo.Fruta;

public interface IFrutaService {
	
	public List<Fruta>listar();
	public Optional<Fruta>listarId(int id);
	public int save(Fruta f);
	public void delete(int id);
	

}
