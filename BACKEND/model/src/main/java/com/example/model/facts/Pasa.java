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
@Table(name = "PASA")
public class Pasa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String tip_pase; // LIVADA,BAGREM,LIPA,ULJANA_REPICA,VOCE,SUMSKA_PASA,SUNCOKRET
	
	private Integer godina;
	
	@OneToOne
	private NadmorskaVisina nadmorksa_visina;
	
	@OneToOne
	private Priroda priroda;
	
	@OneToMany
	private List<Kosnica> kosnice = new ArrayList<Kosnica>();
	
	@OneToMany
	private List<Dan> vremenska_prognoza = new ArrayList<Dan>();
	
	private float ocena;
	

	public Pasa(Long id, String tip_pase, Integer godina, NadmorskaVisina nadmorksa_visina, Priroda priroda,
			List<Kosnica> kosnice, List<Dan> vremenska_prognoza, float ocena) {
		super();
		this.id = id;
		this.tip_pase = tip_pase;
		this.godina = godina;
		this.nadmorksa_visina = nadmorksa_visina;
		this.priroda = priroda;
		this.kosnice = kosnice;
		this.vremenska_prognoza = vremenska_prognoza;
		this.ocena = ocena;
	}

	public Pasa() {
	}

	public String getTip_pase() {
		return tip_pase;
	}

	public void setTip_pase(String tip_pase) {
		this.tip_pase = tip_pase;
	}

	public Integer getGodina() {
		return godina;
	}

	public void setGodina(Integer godina) {
		this.godina = godina;
	}

	public NadmorskaVisina getNadmorksa_visina() {
		return nadmorksa_visina;
	}

	public void setNadmorksa_visina(NadmorskaVisina nadmorksa_visina) {
		this.nadmorksa_visina = nadmorksa_visina;
	}

	public Priroda getPriroda() {
		return priroda;
	}

	public void setPriroda(Priroda priroda) {
		this.priroda = priroda;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Kosnica> getKosnice() {
		return kosnice;
	}

	public void setKosnice(List<Kosnica> kosnice) {
		this.kosnice = kosnice;
	}

	public List<Dan> getVremenska_prognoza() {
		return vremenska_prognoza;
	}

	public void setVremenska_prognoza(List<Dan> vremenska_prognoza) {
		this.vremenska_prognoza = vremenska_prognoza;
	}

	public float getOcena() {
		return ocena;
	}

	public void setOcena(float ocena) {
		this.ocena = ocena;
	}

	public void setKosnice(ArrayList<Kosnica> kosnice) {
		this.kosnice = kosnice;
	}

	

	public void setVremenska_prognoza(ArrayList<Dan> vremenska_prognoza) {
		this.vremenska_prognoza = vremenska_prognoza;
	}

	@Override
	public String toString() {
		return "Pasa [id=" + id + ", tip_pase=" + tip_pase + ", godina=" + godina + ", nadmorksa_visina="
				+ nadmorksa_visina + ", priroda=" + priroda + ", kosnice=" + kosnice + ", vremenska_prognoza="
				+ vremenska_prognoza + ", ocena=" + ocena + "]";
	}

	
}
