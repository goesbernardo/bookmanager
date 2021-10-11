package com.goesbernardo.bookmanager.controller;

import com.goesbernardo.bookmanager.dto.PublisherDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "publisher management")
public interface PublisherControllerDocs {

    @ApiOperation(value = "creation operation")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "created"),
            @ApiResponse(code = 400, message = "bad request")
    })
    PublisherDTO create( PublisherDTO publisherDTO);
}
