package com.humanae.humanae.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.humanae.humanae.models.Parceiros;
import com.humanae.humanae.models.Produtos;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Long>{
	
	public List<Produtos> findByDescricaoContainingIgnoreCase(String descricao);
}
