package pl.iamkonradkrakowiecki.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.iamkonradkrakowiecki.sfgpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {


}
