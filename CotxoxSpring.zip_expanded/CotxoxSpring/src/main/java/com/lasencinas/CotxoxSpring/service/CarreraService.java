package com.lasencinas.CotxoxSpring.service;

import com.lasencinas.CotxoxSpring.domain.Carrera;
import com.lasencinas.CotxoxSpring.repo.CarreraRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarreraService {

    @Autowired
    public CarreraRepo carreraRepo;

    public Long crearCarrera(String tarjeta, String origen, String destino, int distancia, int tiempoEsperado) {

        Carrera carrera = new Carrera(tarjeta);
        carrera.setOrigen(origen);
        carrera.setDestino(destino);
        carrera.setTiempoEsperado(tiempoEsperado);
        carrera.setDistancia(distancia);

        return carreraRepo.save(carrera).getId();

    }

    public Carrera recuperaCarrera(Long idCarrera) {
        return carreraRepo.findById(idCarrera).get();
    }
}
