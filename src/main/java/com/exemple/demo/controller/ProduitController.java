package com.exemple.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.demo.entity.Produit;
import com.exemple.demo.service.IProduitsService;

@RestController
@RequestMapping("/api/produits")
public class ProduitController {

	@Autowired
	private IProduitsService produitsService;
	
	@GetMapping
	public List<Produit> getProduits(){
		return produitsService.getProduits();
	}
}
