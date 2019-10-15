package br.com.flyway.model.user;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository  extends JpaRepository<Usuario, Integer>{

	@Query("SELECT u FROM  Usuario AS u INNER JOIN FETCH  u.produtos")
	List<Usuario> todos();
	
}
