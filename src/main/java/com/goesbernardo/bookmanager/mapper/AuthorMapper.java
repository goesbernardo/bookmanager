package com.goesbernardo.bookmanager.mapper;

import com.goesbernardo.bookmanager.dto.AuthorDTO;
import com.goesbernardo.bookmanager.entity.Author;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorMapper {


    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    Author toModel(AuthorDTO authorDTO);

    AuthorDTO toDTO (Author author);
}
