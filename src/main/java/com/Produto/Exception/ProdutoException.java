package com.Produto.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ProdutoException extends RuntimeException{
	
	public ProdutoException(String msg) {
		super(msg);
	}
}