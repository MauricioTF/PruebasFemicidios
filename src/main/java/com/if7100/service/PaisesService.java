package com.if7100.service;


import java.util.List;
import java.util.Optional;

import com.if7100.entity.IdentidadGenero;
import  com.if7100.entity.Paises;


/**
 * @author Michael Arauz Torrez
 * @since: 27 de abril del 2023
 */
public interface PaisesService {
	List<Paises>getAllPaises();
	Paises getPaisByID(int id);
	Paises getPaisByISO2(String iso2);
	
}
