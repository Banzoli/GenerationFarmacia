package org.generation.BdFarmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import org.generation.BdFarmacia.model.Categoria;

public interface CategoriaRepository  extends JpaRepository<Categoria, Long>{
	
	public List<Categoria> findAllByDescricaoContainingIgonoreCase( String descricao);
	
}