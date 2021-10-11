package com.goesbernardo.bookmanager.repository;

import com.goesbernardo.bookmanager.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {
}
