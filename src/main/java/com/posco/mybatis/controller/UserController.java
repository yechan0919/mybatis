package com.posco.mybatis.controller;

import com.posco.mybatis.dto.ResponseDTO;
import com.posco.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/app/")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "findAll", method = RequestMethod.GET)
    public ResponseEntity<?> findAll() {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setResultCode("S0001");
        responseDTO.setRes(userService.findAll());
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @RequestMapping(value = "findName", method = RequestMethod.GET)
    public ResponseEntity<?> findName() {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setResultCode("S0001");
        responseDTO.setRes(userService.findName());
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
}
