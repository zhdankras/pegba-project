package com.pegba.coreservice.controller;

import com.pegba.coreservice.model.Organization;
import com.pegba.coreservice.service.CoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/core/ogranization")
public class CoreOrganizationController {
    @Autowired
    private CoreService coreService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/getAll")
    public Iterable<Organization> getOrganizations() {
        return coreService.showOrganizations();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public Organization getOrganization(@PathVariable String id) {
        return coreService.showOrganization(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/new")
    public String newOrganization(@RequestBody Organization organization) {
        return coreService.newOrganization(organization);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/delete/{id}")
    public String deleteOrganization(@PathVariable String id) {
        return coreService.deleteOrganization(id);
    }
}
