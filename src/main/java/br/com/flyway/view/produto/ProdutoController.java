package br.com.flyway.view.produto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.flyway.model.produto.Produto;
import br.com.flyway.model.produto.ProdutorRepository;

@RestController
@RequestMapping(value="/")
public class ProdutoController {

	@Autowired
	ProdutorRepository produtorRepository;
	
	@GetMapping(path="produto")
	public ResponseEntity<List<Produto>> index(){
		
		return ResponseEntity.ok(produtorRepository.findAll()) ;
		
	}
	
}
