package com.Produto.Service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.Produto.Domain.entity.*;
import com.Produto.Exception.ProdutoException;
@Service
public class ProdutoService {
	private static int id = 0;
	
	private Map<Integer, Produtos> produtos=new HashMap<Integer, Produtos>();
	
	public Produtos save(Produtos p) {
		id++;
		p.setId(id);
		
		produtos.put(id, p);
		
		return p;
		
	}
	
	public Produtos update(int id, Produtos p) {
		var existente = get(id);
		
		existente.setNome(p.getNome());
		existente.setDescricao(p.getDescricao());
		existente.setStatus(p.getStatus());
		existente.setUrlFoto(p.getUrlFoto());
		existente.setValor(p.getValor());
		
		return existente;
	}
	
	public Produtos get(Integer id) {
			var produto = produtos.get(id);
			
			if(produto == null) {
				throw new ProdutoException("Produto " + id + "nao encontrado");
			}
			return produto;
	}
	public void delete(Integer id) {
		
		get(id);
		
		produtos.remove(id);
	}
}	
