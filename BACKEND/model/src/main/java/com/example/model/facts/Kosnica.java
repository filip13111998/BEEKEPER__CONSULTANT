package com.example.model.facts;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "KOSNICA")
public class Kosnica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer broj_ramova_legla;
	
	private Integer broj_ramova_meda;
	
	private Integer broj_ramova_pcela;
	
	private Integer broj_ramova_polena;
	
	private float ocena;
	
	
	
	


	public Kosnica(Long id, Integer broj_ramova_legla, Integer broj_ramova_meda, Integer broj_ramova_pcela,
			Integer broj_ramova_polena, float ocena) {
		super();
		this.id = id;
		this.broj_ramova_legla = broj_ramova_legla;
		this.broj_ramova_meda = broj_ramova_meda;
		this.broj_ramova_pcela = broj_ramova_pcela;
		this.broj_ramova_polena = broj_ramova_polena;
		this.ocena = ocena;
	}


	public Kosnica() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Integer getBroj_ramova_legla() {
		return broj_ramova_legla;
	}


	public void setBroj_ramova_legla(Integer broj_ramova_legla) {
		this.broj_ramova_legla = broj_ramova_legla;
	}


	public Integer getBroj_ramova_meda() {
		return broj_ramova_meda;
	}


	public void setBroj_ramova_meda(Integer broj_ramova_meda) {
		this.broj_ramova_meda = broj_ramova_meda;
	}


	public Integer getBroj_ramova_pcela() {
		return broj_ramova_pcela;
	}


	public void setBroj_ramova_pcela(Integer broj_ramova_pcela) {
		this.broj_ramova_pcela = broj_ramova_pcela;
	}


	public Integer getBroj_ramova_polena() {
		return broj_ramova_polena;
	}


	public void setBroj_ramova_polena(Integer broj_ramova_polena) {
		this.broj_ramova_polena = broj_ramova_polena;
	}


	public float getOcena() {
		return ocena;
	}


	public void setOcena(float ocena) {
		this.ocena = ocena;
	}


	@Override
	public String toString() {
		return "Kosnica [id=" + id + ", broj_ramova_legla=" + broj_ramova_legla + ", broj_ramova_meda="
				+ broj_ramova_meda + ", broj_ramova_pcela=" + broj_ramova_pcela + ", broj_ramova_polena="
				+ broj_ramova_polena + ", ocena=" + ocena + "]";
	}


	
	
	

}
