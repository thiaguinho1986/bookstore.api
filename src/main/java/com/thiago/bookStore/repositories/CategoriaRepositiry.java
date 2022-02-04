package com.thiago.bookStore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.bookStore.domain.Categoria;

@Repository
public interface CategoriaRepositiry extends JpaRepository<Categoria, Integer> {

}
