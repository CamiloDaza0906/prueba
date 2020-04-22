package com.supermercado.web.app.controlador;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.supermercado.web.app.interfaceService.IFrutaService;
import com.supermercado.web.app.modelo.Fruta;


@Controller
@RequestMapping
public class Controlador {
	
		
	@Autowired
	private IFrutaService service;
	
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Fruta>frutas=service.listar();
		model.addAttribute("frutas", frutas);
		return "index";
		
	}
	
	@GetMapping("/new")
	public String agregar(Model model){
		model.addAttribute("fruta", new Fruta());
		return "form";		
	}
	@PostMapping("/save")
	public String save(@Valid Fruta f, Model model) {
		service.save(f);
		return "redirect:/listar";		
	}
}
