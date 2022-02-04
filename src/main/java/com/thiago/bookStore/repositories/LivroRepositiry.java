package com.thiago.bookStore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.bookStore.domain.Livro;

@Repository
public interface LivroRepositiry extends JpaRepository<Livro, Integer> {

}
