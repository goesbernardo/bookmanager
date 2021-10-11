package com.goesbernardo.bookmanager.builder;

import com.goesbernardo.bookmanager.dto.PublisherDTO;
import lombok.Builder;

import java.time.LocalDate;

@Builder
public class PublisherDTOBuilder {

    @Builder.Default
    private final Long id = 1L;

    private final String name = "goesbernardo";

    private final String code = "102030";

    private final LocalDate foundationDate = LocalDate.now();

    public PublisherDTO  buildPublisherDTO(){
        return new PublisherDTO(id,name,code,foundationDate);
    }
}
