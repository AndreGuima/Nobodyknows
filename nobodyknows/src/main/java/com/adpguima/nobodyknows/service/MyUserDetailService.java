package com.adpguima.nobodyknows.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.adpguima.nobodyknows.config.MyUserDetails;
import com.adpguima.nobodyknows.entity.Usuario;
import com.adpguima.nobodyknows.repository.UsuarioRepository;

/**
 * @author André Guimarães <andrepaivaguimaraes@gmail.com>
 *
 */
@Service
public class MyUserDetailService implements UserDetailsService {

	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Usuario usuario = usuarioRepository.findByEmail(username);

		if (usuario == null) {
			throw new UsernameNotFoundException("User or Password invalid");
		}

		return new MyUserDetails(usuario);
	}

}
