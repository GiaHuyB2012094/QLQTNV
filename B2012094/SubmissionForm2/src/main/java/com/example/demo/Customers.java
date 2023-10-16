package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customers {
	@Override
	public String toString() {
		return "Customers [cid=" + cid + ", cname=" + cname + ", cemail=" + cemail + "]";
	}
	private int cid;
	private String cname;
	private String cemail;
	
	@Id
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
}