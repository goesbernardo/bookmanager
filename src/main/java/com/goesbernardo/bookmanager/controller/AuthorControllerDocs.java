package com.goesbernardo.bookmanager.controller;


import com.goesbernardo.bookmanager.dto.AuthorDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.util.List;

@Api("authors management")
public interface AuthorControllerDocs {

    @ApiOperation(value = "creation operation")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "created"),
            @ApiResponse(code = 400, message = "bad request")
    })
    AuthorDTO create( AuthorDTO authorDTO);

    @ApiOperation(value = "success find by id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "created"),
            @ApiResponse(code = 404, message = "not found id")
    })
    AuthorDTO findById(Long id);

    @ApiOperation(value = "success find all")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "created"),
            @ApiResponse(code = 500, message = "bad request author")
    })
    List<AuthorDTO> findAll(AuthorDTO authorDTO);


}
