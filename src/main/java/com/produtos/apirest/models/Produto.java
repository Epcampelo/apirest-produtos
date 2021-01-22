package com.produtos.apirest.models;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity 
@Table(name = "TB_PRODUTO")
@NoArgsConstructor @AllArgsConstructor
@ToString
public class Produto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Getter @Setter private String nome;
	@Getter @Setter private BigDecimal quantidade;
	@Getter @Setter private BigDecimal valor;
}
