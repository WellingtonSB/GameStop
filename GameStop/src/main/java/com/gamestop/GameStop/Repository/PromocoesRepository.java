package com.gamestop.GameStop.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gamestop.GameStop.model.Promocoes;

@Repository
public interface PromocoesRepository extends JpaRepository<Promocoes, Long> {
	public List<Promocoes> findAllByNomeContainingIgnoreCase(String nome);
	public List<Promocoes> findAllByDescricaoContainingIgnoreCase(String descricao);
}
