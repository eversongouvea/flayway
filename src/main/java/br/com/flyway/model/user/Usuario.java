package br.com.flyway.model.user;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.flyway.model.produto.Produto;
import lombok.Data;

@Data
@Table(name="usuario",schema="usuario" )
@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user")
	private Integer  id;
	
	private String nome;
	
	private Integer  idade;

	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_user")
	private List<Produto> produtos;

	
}
