package com.comptes.multidb.db2.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tab2", schema="tes2")
public class Tab2 {

	
	@Id
	@Column(name = "col2")
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCol1() {
		return col1;
	}

	public void setCol1(String col1) {
		this.col1 = col1;
	}

	@Override
	public String toString() {
		return "Tab2 [id=" + id + ", col1=" + col1 + "]";
	}

	private String col1;
	

	
}
