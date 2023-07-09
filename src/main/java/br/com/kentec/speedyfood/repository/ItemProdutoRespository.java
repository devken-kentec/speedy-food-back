package br.com.kentec.speedyfood.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kentec.speedyfood.domain.ItemProduto;

@Repository
public interface ItemProdutoRespository extends JpaRepository<ItemProduto, Long> {

}
