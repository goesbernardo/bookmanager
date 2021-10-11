package com.goesbernardo.bookmanager.repository;

import com.goesbernardo.bookmanager.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
