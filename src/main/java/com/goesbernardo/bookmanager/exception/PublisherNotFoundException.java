package com.goesbernardo.bookmanager.exception;

import javax.persistence.EntityNotFoundException;

public class PublisherNotFoundException extends EntityNotFoundException {

    public PublisherNotFoundException(Long id) {
        super(String.format("publisher not exists", id));
    }
}
