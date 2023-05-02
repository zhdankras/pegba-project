package com.pegba.coreservice.service;

import com.pegba.coreservice.exception.OrganizationNotFound;
import com.pegba.coreservice.model.Organization;
import com.pegba.coreservice.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoreService {

    @Autowired
    private OrganizationRepository organizationRepository;

    public Organization showOrganization(String id) {
        return organizationRepository.findById(id).orElseThrow(() ->
                new OrganizationNotFound("Organization not found with id " + id)
        );
    }

    public Iterable<Organization> showOrganizations() {
        return organizationRepository.findAll();
    }

    public String newOrganization(Organization organization) {
        organizationRepository.save(organization);
        return "Success!";
    }

    public String deleteOrganization(String id) {
        if (organizationRepository.findById(id).isEmpty() == false)
        {
            organizationRepository.deleteById(id);
            return "Success!";
        }
        else
        {
            return "Not found!";
        }
    }
}
