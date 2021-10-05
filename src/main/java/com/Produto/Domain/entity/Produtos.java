package com.Produto.Domain.entity;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produtos {
	@Id
	private Integer id;
	private String nome;
	private String descricao;
	private String urlFoto;
	private Float valor;
	private Integer status;
}
