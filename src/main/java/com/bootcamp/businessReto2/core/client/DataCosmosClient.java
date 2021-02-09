package com.bootcamp.businessReto2.core.client;

import com.bootcamp.businessReto2.core.dto.SolicitudDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "data-cosmos" , url = "${feign.data-cosmos.url}", path = "v1/solicitud")


public interface DataCosmosClient {

    @PostMapping//[POST]/v1/solicitud
    public SolicitudDto saveSolicitud(@RequestBody SolicitudDto dto);

    @GetMapping
    public List<SolicitudDto> getStudents();

}
