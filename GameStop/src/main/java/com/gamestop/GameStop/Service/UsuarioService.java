package com.gamestop.GameStop.Service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gamestop.GameStop.Repository.UsuarioRepository;
import com.gamestop.GameStop.model.Usuario;

@Service
public class UsuarioService {

	
	@Autowired
	private UsuarioRepository repository;

	public Optional<Usuario> CadastrarUsuario(Usuario usuario) {

		if (repository.findByUsuario(usuario.getUsuario()).isPresent()) {
			return null;
		}
		return Optional.of(repository.save(usuario));
	}
		
		
}
