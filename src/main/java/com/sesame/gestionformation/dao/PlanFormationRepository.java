package com.sesame.gestionformation.dao;

import com.sesame.gestionformation.model.PlanFormation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PlanFormationRepository extends JpaRepository<PlanFormation,Long> {
}
