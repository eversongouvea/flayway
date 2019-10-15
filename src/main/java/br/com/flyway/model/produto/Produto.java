package br.com.flyway.model.produto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "produto",schema = "produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_produto")
	private Integer id;
	
	private String nome;
	
	@Enumerated(EnumType.STRING)
	private Categoria categoria;
	
}
