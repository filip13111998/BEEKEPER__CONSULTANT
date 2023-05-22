package com.example.model.facts;

import org.kie.api.definition.type.Expires;
import org.kie.api.definition.type.Role;

@Role(Role.Type.EVENT)
@Expires("30m")
public class Ocena {
	
	private String type;
	private float ocena;
	
	public Ocena() {
	}
	
	public Ocena(String type, float ocena) {
		super();
		this.type = type;
		this.ocena = ocena;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getOcena() {
		return ocena;
	}
	public void setOcena(float ocena) {
		this.ocena = ocena;
	}
	
	@Override
	public String toString() {
		return "Ocena [type=" + type + ", ocena=" + ocena + "]";
	}
	
}	
