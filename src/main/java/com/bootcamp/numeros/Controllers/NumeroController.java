package com.bootcamp.numeros.Controllers;

import com.bootcamp.numeros.Entities.NumeroRomano;
import com.bootcamp.numeros.Entities.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumeroController {

    @GetMapping(path = "/{number}")
    public Response convertir(@PathVariable String number) {
        try {
            int decimalNumber = Integer.parseInt(number);
            return new Response("OK", "Se ha convertido exitosamente", new NumeroRomano(decimalNumber));
        } catch(NumberFormatException e) {
            return new Response("ERROR", "No has ingresado un numero valido!", null);
        }
    }


}
