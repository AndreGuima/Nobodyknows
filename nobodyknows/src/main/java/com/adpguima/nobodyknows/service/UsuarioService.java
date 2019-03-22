package com.adpguima.nobodyknows.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adpguima.nobodyknows.entity.Usuario;
import com.adpguima.nobodyknows.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;

	public List<Usuario> listaUsuario() {
		return usuarioRepository.findAll();
	}

	public Usuario salvarUsuario(Usuario usuarioAdd) {
		return usuarioRepository.save(usuarioAdd);
	}

	public void deleteUsuario(String id) {
		usuarioRepository.deleteById(id);
	}

	public Optional<Usuario> getById(String id) {
		return usuarioRepository.findById(id);
	}

	public List<Usuario> findByNomeIgnoreCase(String nome) {
		return usuarioRepository.findByNomeIgnoreCase(nome);
	}

}
