package com.goesbernardo.bookmanager.service;

import com.goesbernardo.bookmanager.dto.AuthorDTO;
import com.goesbernardo.bookmanager.entity.Author;
import com.goesbernardo.bookmanager.exception.AuthorNotFoundException;
import com.goesbernardo.bookmanager.mapper.AuthorMapper;
import com.goesbernardo.bookmanager.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    private final static AuthorMapper authorMapper = AuthorMapper.INSTANCE;

    public AuthorDTO create (AuthorDTO authorDTO) {
        Author authorToCreate = authorMapper.toModel(authorDTO);
        Author createdAuthor = authorRepository.save(authorToCreate);

        return authorMapper.toDTO(createdAuthor);
    }

    public AuthorDTO findById(Long id) {
       Author foundAuthor =  authorRepository.findById(id).orElseThrow(() -> new AuthorNotFoundException(id));

       return authorMapper.toDTO(foundAuthor);
    }

    public List<AuthorDTO> findAll(AuthorDTO authorDTO) {

        return authorRepository.findAll().stream().map(authorMapper::toDTO).collect(Collectors.toList());
    }


}
