package com.gamestop.GameStop.Service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gamestop.GameStop.Repository.CategoriaRepository;
import com.gamestop.GameStop.Repository.ProdutosRepository;
import com.gamestop.GameStop.model.Produtos;

@Service
public class ProdutosService {
	
	Random aleatorio = new Random(6785);	
	
	@Autowired
	private ProdutosRepository repository;

	@Autowired
	CategoriaRepository categoriaRepositoy;

	public Produtos cadastrarProduto(Produtos produto) {
		
		
		List<Produtos> produtos = repository.findAll();

		int last = produtos.size()- 1;

		if (produtos.size() != 0) {

			produto.setCodigo(produtos.get(last).getCodigo()+aleatorio.nextInt(999));
			repository.save(produto);

		} else {
			produto.setCodigo(1568);
			repository.save(produto);
		}


		return produto;
	}
	
}
