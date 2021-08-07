package com.belmiro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.belmiro.bookstore.domain.Livro;

public interface LivroRepositories extends JpaRepository<Livro, Integer> {

}
