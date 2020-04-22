package com.supermercado.web.app.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supermercado.web.app.interfaceService.IFrutaService;
import com.supermercado.web.app.interfaces.IFruta;
import com.supermercado.web.app.modelo.Fruta;

@Service
public class FrutaService implements IFrutaService {

	@Autowired
	private IFruta data;
	
	@Override
	public List<Fruta> listar() {
		return (List<Fruta>)data.findAll();
	}

	@Override
	public Optional<Fruta> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Fruta f) {
		int res=0;
		Fruta fruta=data.save(f);
		if(!fruta.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	
	

	
}
