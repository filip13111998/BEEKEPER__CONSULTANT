package com.example.model.facts;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRIRODA")
public class Priroda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer broj_biljaka;
	
	private float teritorijalna_rasprostranjenost;
	
	private float udaljenost_reke;
	
	private float ocena;

	
	
	

	public Priroda(Long id, Integer broj_biljaka, float teritorijalna_rasprostranjenost, float udaljenost_reke,
			float ocena) {
		super();
		this.id = id;
		this.broj_biljaka = broj_biljaka;
		this.teritorijalna_rasprostranjenost = teritorijalna_rasprostranjenost;
		this.udaljenost_reke = udaljenost_reke;
		this.ocena = ocena;
	}

	public Priroda() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getBroj_biljaka() {
		return broj_biljaka;
	}

	public void setBroj_biljaka(Integer broj_biljaka) {
		this.broj_biljaka = broj_biljaka;
	}

	public float getTeritorijalna_rasprostranjenost() {
		return teritorijalna_rasprostranjenost;
	}


	public void setTeritorijalna_rasprostranjenost(float teritorijalna_rasprostranjenost) {
		this.teritorijalna_rasprostranjenost = teritorijalna_rasprostranjenost;
	}


	public float getUdaljenost_reke() {
		return udaljenost_reke;
	}

	public void setUdaljenost_reke(float udaljenost_reke) {
		this.udaljenost_reke = udaljenost_reke;
	}


	public float getOcena() {
		return ocena;
	}


	public void setOcena(float ocena) {
		this.ocena = ocena;
	}

	@Override
	public String toString() {
		return "Priroda [id=" + id + ", broj_biljaka=" + broj_biljaka + ", teritorijalna_rasprostranjenost="
				+ teritorijalna_rasprostranjenost + ", udaljenost_reke=" + udaljenost_reke + ", ocena=" + ocena + "]";
	}

	
	

}
