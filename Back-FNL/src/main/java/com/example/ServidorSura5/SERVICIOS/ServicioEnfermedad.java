package com.example.ServidorSura5.SERVICIOS;


import com.example.ServidorSura5.MODELOS.Enfermedad;
import com.example.ServidorSura5.MODELOS.Paciente;
import com.example.ServidorSura5.REPOSITORIOS.IRepositorioEnfermedad;
import com.example.ServidorSura5.REPOSITORIOS.IRepositorioPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioEnfermedad {

    //1. Llamar al repositorio respectivo
    @Autowired
    IRepositorioEnfermedad iRepositorioEnfermedad;

    //2. Se programan las funciones para las distintas operaciones en la BD

    //3. Funcion para guardar datos
    public Enfermedad guardarEnfermedad(Enfermedad datosEnfermedad) throws Exception {
        try {
            return iRepositorioEnfermedad.save(datosEnfermedad);

        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }


}

