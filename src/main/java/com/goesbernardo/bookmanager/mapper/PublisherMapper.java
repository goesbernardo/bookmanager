package com.goesbernardo.bookmanager.mapper;

import com.goesbernardo.bookmanager.dto.PublisherDTO;
import com.goesbernardo.bookmanager.entity.Publisher;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PublisherMapper {

    PublisherMapper INSTANCE = Mappers.getMapper(PublisherMapper.class);

    Publisher toModel(PublisherDTO publisherDTO);

    PublisherDTO toDTO (Publisher publisher);

}
