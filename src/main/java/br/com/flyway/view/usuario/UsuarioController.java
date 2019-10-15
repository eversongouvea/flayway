package br.com.flyway.view.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.flyway.model.user.Usuario;
import br.com.flyway.model.user.UsuarioRepository;

@RestController
@RequestMapping(value = "/")
public class UsuarioController {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@GetMapping(path="usuario")
	public ResponseEntity<List<Usuario>> init(){
		
		return ResponseEntity.ok(usuarioRepository.todos());
		
	}
	
}
