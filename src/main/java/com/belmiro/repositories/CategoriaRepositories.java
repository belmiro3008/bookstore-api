package com.belmiro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.belmiro.bookstore.domain.Categoria;

@Repository
public interface CategoriaRepositories extends JpaRepository<Categoria, Integer> {

}
