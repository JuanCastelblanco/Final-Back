package com.example.ServidorSura5.SERVICIOS;


import com.example.ServidorSura5.MODELOS.Paciente;
import com.example.ServidorSura5.MODELOS.SignoVital;
import com.example.ServidorSura5.REPOSITORIOS.IRepositorioPaciente;
import com.example.ServidorSura5.REPOSITORIOS.IRepositorioSignoVital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioSignoVital {

    //1. Llamar al repositorio respectivo
    @Autowired
    IRepositorioSignoVital iRepositorioSignoVital;

    //2. Se programan las funciones para las distintas operaciones en la BD

    //3. Funcion para guardar datos
    public SignoVital guardarSignoVital(SignoVital datosSignoVital) throws Exception {
        try {
            return iRepositorioSignoVital.save(datosSignoVital);

        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }


}

