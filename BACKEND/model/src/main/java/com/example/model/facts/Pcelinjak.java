package com.example.model.facts;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PCELINJAK")
public class Pcelinjak {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany
	private List<Pasa> pase = new ArrayList<Pasa>();//Pase na kojima je pcelinjak bio koje godine 
	//private String tip_pase; // LIVADA,BAGREM,LIPA,ULJANA_REPICA,VOCE,SUMSKA_PASA,SUNCOKRET
//	private NadmorskaVisina nadmorksa_visina;
//	private Priroda priroda;
//	private ArrayList<Kosnica> kosnice = new ArrayList<Kosnica>();
//	private ArrayList<Dan> vremenska_prognoza = new ArrayList<Dan>();
	@OneToOne
	private Pasa pasa;
	
	private float ocena;
	
	public Pcelinjak(Long id, List<Pasa> pase, Pasa pasa, float ocena) {
		super();
		this.id = id;
		this.pase = pase;
		this.pasa = pasa;
		this.ocena = ocena;
	}
	public Pcelinjak() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Pasa> getPase() {
		return pase;
	}
	public void setPase(List<Pasa> pase) {
		this.pase = pase;
	}
	public Pasa getPasa() {
		return pasa;
	}
	public void setPasa(Pasa pasa) {
		this.pasa = pasa;
	}
	public float getOcena() {
		return ocena;
	}
	public void setOcena(float ocena) {
		this.ocena = ocena;
	}
	@Override
	public String toString() {
		return "Pcelinjak [id=" + id + ", pase=" + pase + ", pasa=" + pasa + ", ocena=" + ocena + "]";
	}
	
	
	
	
	
	

}
