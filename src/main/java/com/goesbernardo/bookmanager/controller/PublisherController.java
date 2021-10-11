package com.goesbernardo.bookmanager.controller;

import com.goesbernardo.bookmanager.dto.PublisherDTO;
import com.goesbernardo.bookmanager.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/publishers")
public class PublisherController implements PublisherControllerDocs {

    @Autowired
    private PublisherService publisherService;

    public PublisherController(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PublisherDTO create(@RequestBody @Valid PublisherDTO publisherDTO) {
        return publisherService.create(publisherDTO);
    }

    @GetMapping(value = "/{id}")
    public PublisherDTO findById(@PathVariable Long id) {
        return publisherService.findById(id);
    }

    @GetMapping
    public List<PublisherDTO> findAll(PublisherDTO publisherDTO) {
        return publisherService.findAll(publisherDTO);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteByid(@PathVariable Long id) {
        publisherService.deleteByid(id);
    }
}
