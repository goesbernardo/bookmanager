package com.goesbernardo.bookmanager.exception;

import javax.persistence.EntityNotFoundException;

public class AuthorNotFoundException extends EntityNotFoundException {

    public AuthorNotFoundException(Long id) {
        super(String.format("author with id not exists",id));
    }
}
