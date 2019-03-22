package com.adpguima.nobodyknows.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.adpguima.nobodyknows.entity.Perfil;
import com.adpguima.nobodyknows.entity.Usuario;
import com.adpguima.nobodyknows.repository.PerfilRepository;
import com.adpguima.nobodyknows.repository.UsuarioRepository;

/**
 * @author André Guimarães <andrepaivaguimaraes@gmail.com>
 *
 */
@Component
public class CargaInicial implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	UsuarioRepository usuarioRepository;

	@Autowired
	PerfilRepository perfilRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {

		List<Perfil> perfis = perfilRepository.findAll();
		if (perfis.isEmpty()) {
			perfilRepository.save(new Perfil("ROLE_ADMIN"));
		}

		Perfil perfil = perfilRepository.findByNome("ROLE_ADMIN");
		List<Perfil> perfisUsuario = new ArrayList<Perfil>();
		perfisUsuario.add(perfil);
		
		usuarioRepository.save(new Usuario("André", perfisUsuario, "andrepaivaguimaraes@gmail.com", "1234"));
	}

}
