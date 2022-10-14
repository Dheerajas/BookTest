package com.example.BookApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BookApp.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
