package com.if7100.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.if7100.entity.Victima;

@Repository
public interface VictimaRepository extends JpaRepository<Victima, Integer> { 

	Victima findByCVNombre(String CV_Nombre);
}
