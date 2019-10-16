package br.com.flyway.model.produto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@JsonInclude(Include.NON_NULL)
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
	
	@Column(length=50,nullable = true)
	private String descricao;
	
}
