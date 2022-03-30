package org.generation.BdFarmacia.repository;

import java.util.List;

import org.generation.BdFarmacia.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
			public List<Produto> findAllByTituloContainingIgonreCase (String titulo);
			
			}