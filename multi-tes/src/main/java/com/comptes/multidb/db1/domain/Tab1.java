package com.comptes.multidb.db1.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab1", schema="tes1")
public class Tab1 {


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

	private String col1;

	@Override
	public String toString() {
		return "Tab1 [id=" + id + ", col1=" + col1 + "]";
	}
	
	
}
