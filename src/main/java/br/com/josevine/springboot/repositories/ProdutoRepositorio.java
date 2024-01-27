package br.com.josevine.springboot.repositories;

import br.com.josevine.springboot.models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProdutoRepositorio extends JpaRepository<ProdutoModel, UUID> {}
