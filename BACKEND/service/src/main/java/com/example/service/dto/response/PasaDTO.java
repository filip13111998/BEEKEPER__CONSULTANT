package com.example.service.dto.response;


public class PasaDTO {

	private Long id;
	
	private String tip; // LIVADA,BAGREM,LIPA,ULJANA_REPICA,VOCE,SUMSKA_PASA,SUNCOKRET
	
	private Integer godina;

	
	
	
	public PasaDTO() {
	}

	public PasaDTO(Long id, String tip, Integer godina) {
		this.id = id;
		this.tip = tip;
		this.godina = godina;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public Integer getGodina() {
		return godina;
	}

	public void setGodina(Integer godina) {
		this.godina = godina;
	}
	
	
	
}
