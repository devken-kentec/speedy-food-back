package br.com.kentec.speedyfood.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kentec.speedyfood.domain.Produtos;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Long> {

}
