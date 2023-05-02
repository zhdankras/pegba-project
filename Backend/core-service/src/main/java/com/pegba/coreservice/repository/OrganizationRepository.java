package com.pegba.coreservice.repository;

import com.pegba.coreservice.model.Organization;
import org.springframework.data.repository.CrudRepository;

public interface OrganizationRepository extends CrudRepository<Organization, String> {
}
