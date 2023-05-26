package com.example.service.dto.request;

public class PasaFormDTO {
	
	private String tip;
	
	private Integer godina;

	public PasaFormDTO(String tip, Integer godina) {
		super();
		this.tip = tip;
		this.godina = godina;
	}

	public PasaFormDTO() {
		super();
		// TODO Auto-generated constructor stub
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
