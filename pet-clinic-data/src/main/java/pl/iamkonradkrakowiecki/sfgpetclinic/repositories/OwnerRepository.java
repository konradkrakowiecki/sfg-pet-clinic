package pl.iamkonradkrakowiecki.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.iamkonradkrakowiecki.sfgpetclinic.model.Owner;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
