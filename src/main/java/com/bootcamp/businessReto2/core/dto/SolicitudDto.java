package com.bootcamp.businessReto2.core.dto;

import lombok.Data;

@Data
public class SolicitudDto {
    private String id;
    private String name;
    private String lastName;
    private String dni;
    private String motivo;
    private String argumento;
}