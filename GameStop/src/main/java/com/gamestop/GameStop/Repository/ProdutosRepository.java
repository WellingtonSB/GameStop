package com.gamestop.GameStop.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gamestop.GameStop.model.Produtos;



@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Long> {
	public List<Produtos> findAllByNomeContainingIgnoreCase(String nome);
	public List<Produtos> findAllByDescricaoContainingIgnoreCase(String descricao);
			
}
