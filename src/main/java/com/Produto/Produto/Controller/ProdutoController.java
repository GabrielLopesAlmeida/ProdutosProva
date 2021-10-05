package com.Produto.Produto.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Produto.Domain.entity.Produtos;
import com.Produto.Service.ProdutoService;
import com.Produto.Domain.*;
@RestController
public class ProdutoController {
	private final ProdutoService produtoService;
	public ProdutoController(ProdutoService produtoService) {
		this.produtoService = produtoService;
	}
	
	@GetMapping("/produtos/{id}")
	public Produtos getById(@PathVariable Integer id){
		var produto = produtoService.get(id);
		
		return new Produtos(produto);
	}
	
	@GetMapping("/produtos")
	public list<Produtos> getAll(){
		var produtos = produtoService.getAll();
		
		var ProdutosDtos = new ArrayList<Produtos>();
		
		for(var produto: produtos) {
			ProdutosDtos.add(new Produtos(produto));
		}
		return ProdutosDtos;
	}
}
