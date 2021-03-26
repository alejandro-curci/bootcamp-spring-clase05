package com.bootcamp.numeros.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Response {

    private String status;
    private String message;
    private NumeroRomano data;

}
