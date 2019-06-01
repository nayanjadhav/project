package com.comptes.multidb.db1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comptes.multidb.db1.domain.Tab1;

@Repository
public interface Tab1Repo extends JpaRepository<Tab1, Long> {
	

}
