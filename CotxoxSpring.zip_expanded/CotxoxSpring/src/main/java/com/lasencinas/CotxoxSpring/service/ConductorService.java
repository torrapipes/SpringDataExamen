package com.lasencinas.CotxoxSpring.service;

import com.lasencinas.CotxoxSpring.domain.Conductor;
import com.lasencinas.CotxoxSpring.repo.ConductorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class ConductorService {

    @Autowired
    ConductorRepo conductorRepo;

    public Conductor recuperarConductor(String tarjeta) {
        return conductorRepo.findById(tarjeta).get();
    }

    public void crearConductor(String tarjeta, String nombre, String matricula, String modelo, boolean ocupada){

        Conductor conductor = new Conductor(tarjeta);

        conductor.setNombre(nombre);
        conductor.setModelo(modelo);
        conductor.setMatricula(matricula);
        conductor.setOcupado(ocupada);

        conductorRepo.save(conductor);

    }

    @PostConstruct
    public void init(){
        crearConductor("2222222222222222", "Sabrina", "5DHJ444", "Toyota Prius", false );
        crearConductor("3333333333333333", "Cici", "7JKK555", "Mercedes A", false);
    }

}
