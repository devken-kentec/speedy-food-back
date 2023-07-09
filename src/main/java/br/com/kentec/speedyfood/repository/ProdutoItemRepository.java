package br.com.kentec.speedyfood.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.kentec.speedyfood.domain.ProdutoItem;

@Repository
public interface ProdutoItemRepository extends JpaRepository<ProdutoItem, Long>{
	
	@Query("SELECT pi FROM ProdutoItem pi "
			+ "JOIN pi.produto p "
			+ "WHERE p.id = :id_produto ")
	public List<ProdutoItem> listarProdutoItem(@Param("id_produto") Long id_produto);
}
