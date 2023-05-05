package com.example.model.facts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "PCELAR")
public class Pcelar implements UserDetails{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany
	private List<Pcelinjak> kosnice = new ArrayList<Pcelinjak>();
	
	private float ukupna_ocena_pcelinjaka;
	
	private float ocena_pcelar;
	
	@Column(unique = true , nullable = false)
    private String username; //e-mail

    private String password;
	

	

	public Pcelar(Long id, List<Pcelinjak> kosnice, float ukupna_ocena_pcelinjaka, float ocena_pcelar, String username,
			String password) {
		super();
		this.id = id;
		this.kosnice = kosnice;
		this.ukupna_ocena_pcelinjaka = ukupna_ocena_pcelinjaka;
		this.ocena_pcelar = ocena_pcelar;
		this.username = username;
		this.password = password;
	}
	
	public Pcelar() {

	}

//	 @Override
    public String getPassword() {
        return password;
    }

//    @Override
    public String getUsername() {
        return username;
    }

	
	public void setUsername(String username) {
		this.username = username;
	}

	

	public void setPassword(String password) {
		this.password = password;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Pcelinjak> getKosnice() {
		return kosnice;
	}

	public void setKosnice(List<Pcelinjak> kosnice) {
		this.kosnice = kosnice;
	}

	public float getUkupna_ocena_pcelinjaka() {
		return ukupna_ocena_pcelinjaka;
	}

	public void setUkupna_ocena_pcelinjaka(float ukupna_ocena_pcelinjaka) {
		this.ukupna_ocena_pcelinjaka = ukupna_ocena_pcelinjaka;
	}

	public float getOcena_pcelar() {
		return ocena_pcelar;
	}

	public void setOcena_pcelar(float ocena_pcelar) {
		this.ocena_pcelar = ocena_pcelar;
	}

	

	@Override
	public String toString() {
		return "Pcelar [id=" + id + ", kosnice=" + kosnice + ", ukupna_ocena_pcelinjaka=" + ukupna_ocena_pcelinjaka
				+ ", ocena_pcelar=" + ocena_pcelar + ", username=" + username + ", password=" + password + "]";
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Arrays.asList(new SimpleGrantedAuthority("ROLE_BEEKEPER"));
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
	
	
}
