package com.ZainRehman.libraryapp;


import org.springframework.data.jpa.repository.JpaRepository;
import com.zainrehman.libraryapp.Models.book;

public interface BookRepository extends JpaRepository<book, Long> {
}