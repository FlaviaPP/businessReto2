package com.bootcamp.businessReto2.core.service.impl;

import com.bootcamp.businessReto2.core.client.DataCosmosClient;
import com.bootcamp.businessReto2.core.dto.SolicitudDto;
import com.bootcamp.businessReto2.core.service.CrudService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.context.annotation.Profile;

import java.util.List;


@Service
public class CrudFeignImpl implements CrudService {

    RestTemplate restTemplate = new RestTemplate();

    @Autowired
     DataCosmosClient dataCosmosClient;

    @Override
    public String callCrud(SolicitudDto dto) {


        SolicitudDto solicitudDto = dataCosmosClient.saveSolicitud(dto);



        List<SolicitudDto> solicitudDtos = dataCosmosClient.getStudents();

        return solicitudDto.getId();
    }
}
