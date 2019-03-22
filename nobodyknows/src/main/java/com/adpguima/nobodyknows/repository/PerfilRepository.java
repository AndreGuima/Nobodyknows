package com.adpguima.nobodyknows.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.adpguima.nobodyknows.entity.Perfil;

public interface PerfilRepository extends MongoRepository<Perfil, String> {

	Perfil findByNome(String role_admin);

}
