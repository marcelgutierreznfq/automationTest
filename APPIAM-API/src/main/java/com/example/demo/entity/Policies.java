package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
 
@Data
@Entity
@Table(name="policies")
public class Policies {

    @Id
    @Column(name="idpolicy")
    private String idPolicy;

    @Column(name="numberpolicy")
    private String numberPolicy;

    @Column(name="versionpolicy")
    private String versionPolicy;

    @Column(name="timestamp")
    private String timeStamp;

	public Policies() {};
	
	 public Policies(String idPolicy, String numberPolicy, String versionPolicy , String timeStamp) {
	        this.idPolicy = idPolicy;
	        this.numberPolicy = numberPolicy;
	        this.timeStamp = timeStamp;
	        this.versionPolicy=versionPolicy;
	    }
	
//	    @Override
//	    public String toString() {
//	        return "Policies [Policies=" + idPolicy + ", numberPolicy=" + numberPolicy + ", versionPolicy=" + versionPolicy + ", createdAt=" + timeStamp + "]";
//	    }

	
	 
	    @Override
	    public String toString() {
	        return "holaaaaa";
	    }
	 
	 
}
