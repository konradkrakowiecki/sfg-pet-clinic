package pl.iamkonradkrakowiecki.sfgpetclinic.services;

import pl.iamkonradkrakowiecki.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
