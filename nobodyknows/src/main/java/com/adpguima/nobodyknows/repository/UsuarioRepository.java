package com.adpguima.nobodyknows.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.adpguima.nobodyknows.entity.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {

	List<Usuario> findByNomeIgnoreCase(String nome);

	Usuario findByEmail(String username);

}
