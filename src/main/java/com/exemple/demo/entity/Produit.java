package com.exemple.demo.entity;

public class Produit {
	private String ref;
	private String nom;
	private double qte;
	private float prix;
    
	public Produit(String ref, String nom, double qte, float prix) {
		super();
		this.ref = ref;
		this.nom = nom;
		this.qte = qte;
		this.prix = prix;
	}
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getQte() {
		return qte;
	}
	public void setQte(double qte) {
		this.qte = qte;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}

}
