package com.example.model.facts;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NADMORSKA_VISINA")
public class NadmorskaVisina {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer nadmorska_visina;
	
	private String polozaj_terena; // RAVNO,BRDO,DOLINA
	
	private float ocena;
	
	
	public NadmorskaVisina( Integer nadmorska_visina, String polozaj_terena) {

		this.nadmorska_visina = nadmorska_visina;
		this.polozaj_terena = polozaj_terena;
	}
	

	public NadmorskaVisina(Long id, Integer nadmorska_visina, String polozaj_terena, float ocena) {
		super();
		this.id = id;
		this.nadmorska_visina = nadmorska_visina;
		this.polozaj_terena = polozaj_terena;
		this.ocena = ocena;
	}

	public NadmorskaVisina() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNadmorska_visina() {
		return nadmorska_visina;
	}

	public void setNadmorska_visina(Integer nadmorska_visina) {
		this.nadmorska_visina = nadmorska_visina;
	}

	public String getPolozaj_terena() {
		return polozaj_terena;
	}

	public void setPolozaj_terena(String polozaj_terena) {
		this.polozaj_terena = polozaj_terena;
	}

	public float getOcena() {
		return ocena;
	}

	public void setOcena(float ocena) {
		this.ocena = ocena;
	}

	@Override
	public String toString() {
		return "NadmorskaVisina [id=" + id + ", nadmorska_visina=" + nadmorska_visina + ", polozaj_terena="
				+ polozaj_terena + ", ocena=" + ocena + "]";
	}



}
