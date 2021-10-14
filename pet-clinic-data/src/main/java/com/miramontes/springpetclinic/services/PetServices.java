package com.miramontes.springpetclinic.services;

import com.miramontes.springpetclinic.model.Owner;
import com.miramontes.springpetclinic.model.Pet;

import java.util.Set;

public interface PetServices {
    Pet findById(Long id);

    Pet save(Owner owner);

    Set<Pet> findAll();
}
