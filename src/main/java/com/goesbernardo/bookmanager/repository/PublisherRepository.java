package com.goesbernardo.bookmanager.repository;

import com.goesbernardo.bookmanager.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher,Long> {
}
