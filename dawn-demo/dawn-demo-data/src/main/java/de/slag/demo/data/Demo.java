package de.slag.demo.data;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Demo implements Serializable
//extends PersistBean
{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic
	private Long id;
	
	@Basic
	private Integer wert;

	public Long getId() {
		return id;
	}


	public Integer getWert() {
		return wert;
	}

	public void setWert(Integer wert) {
		this.wert = wert;
	}
	

}
