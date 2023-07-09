package br.com.kentec.speedyfood.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.kentec.speedyfood.domain.VariedadeItem;

@Repository
public interface VariedadeItemRepository extends JpaRepository<VariedadeItem, Long> {
	
	@Query("SELECT vi.id, vi.descricao, vi.valor FROM VariedadeItem vi WHERE vi.itemProduto.id = :idItem ")
	public Iterable<VariedadeItem> listarVariedadeItem(@Param("idItem") Long idItem);

}
