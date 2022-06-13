package com.carnegielearning.nextproblem.controllers;

import com.carnegielearning.nextproblem.dto.RequestDTO;
import com.carnegielearning.nextproblem.dto.ResponseDTO;
import com.carnegielearning.nextproblem.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/problem")
public class ProblemController {

    @Autowired
    private ProblemService service;

    @PostMapping("/next")
    public ResponseEntity<ResponseDTO> getNextProblem(@RequestBody RequestDTO body){

        return new ResponseEntity<>( service.findNextProblem(body), HttpStatus.OK);
    }
}
