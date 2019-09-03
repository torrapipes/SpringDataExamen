package com.lasencinas.CotxoxSpring.service;

import com.lasencinas.CotxoxSpring.domain.Conductor;
import com.lasencinas.CotxoxSpring.repo.ConductorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConductorService {

    @Autowired
    ConductorRepo conductorRepo;

    public Conductor recuperarConductor(String tarjeta) {
        return conductorRepo.findById(tarjeta).get();
    }

}
