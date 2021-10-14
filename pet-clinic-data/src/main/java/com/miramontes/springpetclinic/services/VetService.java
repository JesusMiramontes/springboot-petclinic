package com.miramontes.springpetclinic.services;

import com.miramontes.springpetclinic.model.Owner;
import com.miramontes.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Owner owner);

    Set<Vet> findAll();
}
