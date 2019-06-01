package com.comptes.multidb.db2.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comptes.multidb.db2.domain.Tab2;

@Repository
public interface Tab2Repo extends JpaRepository<Tab2, Long>{

	Optional<Tab2> findById(Long id);

}
