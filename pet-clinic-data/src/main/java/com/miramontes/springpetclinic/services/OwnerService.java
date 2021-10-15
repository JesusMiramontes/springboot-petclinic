package com.miramontes.springpetclinic.services;

import com.miramontes.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
