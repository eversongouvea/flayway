package br.com.flyway.model.produto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProdutorRepository extends JpaRepository<Produto, Integer>{

}
