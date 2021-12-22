package com.example.cm18octobre2021.dao;

import com.example.cm18octobre2021.entities.Offre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@RepositoryRestResource
public interface OffreInterface extends JpaRepository<Offre, Long> {

}
