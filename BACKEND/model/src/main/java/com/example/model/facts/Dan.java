package com.example.model.facts;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DAN")
public class Dan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private float temperatura;
	
	private float vlaznost_vazduha;
	
	private float jacina_vetra;
	
	private String tip_dana; // SUNCE,OBLAK,KISA,SNEG,MAGLA
	
	private float ocena;
	
	public Dan() {
	}
	
	

	public Dan(Long id, float temperatura, float vlaznost_vazduha, float jacina_vetra, String tip_dana, float ocena) {
		super();
		this.id = id;
		this.temperatura = temperatura;
		this.vlaznost_vazduha = vlaznost_vazduha;
		this.jacina_vetra = jacina_vetra;
		this.tip_dana = tip_dana;
		this.ocena = ocena;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public float getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}
	public float getVlaznost_vazduha() {
		return vlaznost_vazduha;
	}
	public void setVlaznost_vazduha(float vlaznost_vazduha) {
		this.vlaznost_vazduha = vlaznost_vazduha;
	}
	public float getJacina_vetra() {
		return jacina_vetra;
	}
	public void setJacina_vetra(float jacina_vetra) {
		this.jacina_vetra = jacina_vetra;
	}
	public String getTip_dana() {
		return tip_dana;
	}
	public void setTip_dana(String tip_dana) {
		this.tip_dana = tip_dana;
	}
	public float getOcena() {
		return ocena;
	}
	public void setOcena(float ocena) {
		this.ocena = ocena;
	}



	@Override
	public String toString() {
		return "Dan [id=" + id + ", temperatura=" + temperatura + ", vlaznost_vazduha=" + vlaznost_vazduha
				+ ", jacina_vetra=" + jacina_vetra + ", tip_dana=" + tip_dana + ", ocena=" + ocena + "]";
	}

	
	

}
