package com.adpguima.nobodyknows.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adpguima.nobodyknows.entity.Usuario;
import com.adpguima.nobodyknows.service.UsuarioService;

/**
 * @author André Guimarães <andrepaivaguimaraes@gmail.com>
 *
 */
@RestController
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;

	@RequestMapping(value = "/usuario", method = RequestMethod.GET)
	public List<Usuario> listar() {
		return this.usuarioService.listaUsuario();
	}

	@RequestMapping(value = "/usuario/{id}", method = RequestMethod.GET)
	public Optional<Usuario> getById(@PathVariable String id) {
		return this.usuarioService.getById(id);
	}

	@RequestMapping(value = "/usuario/{nome}/nome", method = RequestMethod.GET)
	public List<Usuario> listByNomeUsuario(@PathVariable String nome) {
		return this.usuarioService.findByNomeIgnoreCase(nome);
	}

	@RequestMapping(value = "/usuario", method = RequestMethod.POST)
	public Usuario salvar(@RequestBody Usuario usuario) {
		return this.usuarioService.salvarUsuario(usuario);
	}

	@RequestMapping(value = "/usuario", method = RequestMethod.PUT)
	public Usuario editar(@RequestBody Usuario usuario) {
		return this.usuarioService.salvarUsuario(usuario);
	}

	@RequestMapping(value = "/usuario/{id}", method = RequestMethod.DELETE)
	public void deletar(@PathVariable String id) {
		this.usuarioService.deleteUsuario(id);
	}

}
