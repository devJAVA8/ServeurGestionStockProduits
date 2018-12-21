package com.exemple.demo.service;

import java.util.List;

import com.exemple.demo.entity.Produit;

public interface IProduitsService {

	public List<Produit> getProduits();
	public void addProduit(Produit p);
	public int removeProduit(Produit p);
	public List<Produit> findProduitById(String id);
	public List<Produit> findProduitByName(String name);
	public void updateProduit(Produit p);
	
}
