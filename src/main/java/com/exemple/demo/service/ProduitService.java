package com.exemple.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exemple.demo.entity.Produit;

@Service
public class ProduitService implements IProduitsService{
 
	private List<Produit> produits;
	
/*	public ProduitService() {
		produits.add((new Produit("sqdsq","prod1",15,15.55f)));
		produits.add((new Produit("sdsdcx","prod2",15,151.55f)));
		produits.add((new Produit("xcx","prod2",15,1555f)));
		produits.add((new Produit("jkjk","prod3",15,122.55f)));
		produits.add((new Produit("ili_l","prod4",15,55f)));
		produits.add((new Produit("hj;uyi","prod5",15,15.55f)));
	}*/
	@Override
	public List<Produit> getProduits() {
		produits.add((new Produit("sqdsq","prod1",15,15.55f)));
		produits.add((new Produit("sdsdcx","prod2",15,151.55f)));
		produits.add((new Produit("xcx","prod2",15,1555f)));
		produits.add((new Produit("jkjk","prod3",15,122.55f)));
		produits.add((new Produit("ili_l","prod4",15,55f)));
		produits.add((new Produit("hj;uyi","prod5",15,15.55f)));
		return produits;
	}

	@Override
	public void addProduit(Produit p) {
		if (p != null) {
			produits.add(p);
		}
		
	}

	@Override
	public int removeProduit(Produit p) {
		if(p != null) {
			produits.remove(p);
			return 1;
		}
		else 
		  return 0;
	}

	@Override
	public List<Produit> findProduitById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> findProduitByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateProduit(Produit p) {
		// TODO Auto-generated method stub
		
	}

}
