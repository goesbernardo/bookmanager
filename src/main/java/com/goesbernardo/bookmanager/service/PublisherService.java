package com.goesbernardo.bookmanager.service;

import com.goesbernardo.bookmanager.dto.PublisherDTO;
import com.goesbernardo.bookmanager.entity.Publisher;
import com.goesbernardo.bookmanager.exception.PublisherAlreadyExistsException;
import com.goesbernardo.bookmanager.exception.PublisherNotFoundException;
import com.goesbernardo.bookmanager.mapper.PublisherMapper;
import com.goesbernardo.bookmanager.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PublisherService {


    private final static PublisherMapper publisherMapper = PublisherMapper.INSTANCE;

    private PublisherRepository publisherRepository;

    @Autowired
    public PublisherService(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    public PublisherDTO create (PublisherDTO publisherDTO) {

        Optional<Publisher> duplicatedPublisher = publisherRepository.findByNameOrCode(publisherDTO.getName(), publisherDTO.getCode());
        if(duplicatedPublisher.isPresent()){
            throw new PublisherAlreadyExistsException(publisherDTO.getName(),publisherDTO.getCode());
        }

        Publisher publisherToCreate = publisherMapper.toModel(publisherDTO);
        Publisher createdPublisher = publisherRepository.save(publisherToCreate);

        return publisherMapper.toDTO(createdPublisher);
    }

    public PublisherDTO findById(Long id) {

        return publisherRepository.findById(id).map(publisherMapper::toDTO)
                .orElseThrow(()-> new PublisherNotFoundException(id));
    }

    public List<PublisherDTO> findAll(PublisherDTO publisherDTO){

        return publisherRepository.findAll().stream().map(publisherMapper::toDTO).collect(Collectors.toList());
    }

    public void deleteByid(Long id) {

        publisherRepository.deleteById(id);
    }


}
