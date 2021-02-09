package com.bootcamp.businessReto2.api;


import com.bootcamp.businessReto2.core.dto.SolicitudDto;
import com.bootcamp.businessReto2.core.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/product")
public class businessController {
    @Autowired
    CrudService crudService;

    @PostMapping
    public ResponseEntity callCrud(@RequestBody SolicitudDto solicitudDto) {
        return ResponseEntity.ok().body(crudService.callCrud(solicitudDto));
    }

}
