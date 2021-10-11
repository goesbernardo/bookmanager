package com.goesbernardo.bookmanager.repository;

import com.goesbernardo.bookmanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
