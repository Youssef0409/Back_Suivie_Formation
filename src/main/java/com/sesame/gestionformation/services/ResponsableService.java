package com.sesame.gestionformation.services;

import com.sesame.gestionformation.dto.ResponsableDto;
import com.sesame.gestionformation.model.Collaborateur;
import com.sesame.gestionformation.model.Responsable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ResponsableService {
    ResponsableDto save(ResponsableDto formateur);
    ResponsableDto findById(Integer id);
    List<ResponsableDto> findAll();
    void delete(Integer id);
    ResponseEntity<Responsable> updateResponsable(@PathVariable Integer id,
                                                      @RequestBody Responsable responsable);
}
