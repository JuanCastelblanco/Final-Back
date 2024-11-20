package com.example.ServidorSura5.CONTROLADORES;

import com.example.ServidorSura5.MODELOS.Medicamento;
import com.example.ServidorSura5.SERVICIOS.ServicioMedicamentos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/medicamentos")
public class ControladorMedicamentos {

    @Autowired
    ServicioMedicamentos servicioMedicamentos;

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody Medicamento datos){
        try {
            return ResponseEntity
                .status(HttpStatus.OK)
                .body(servicioMedicamentos.guardarMedicamento(datos));

        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

}
