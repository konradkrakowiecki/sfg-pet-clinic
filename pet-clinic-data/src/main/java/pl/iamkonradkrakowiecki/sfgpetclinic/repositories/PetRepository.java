package pl.iamkonradkrakowiecki.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.iamkonradkrakowiecki.sfgpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {


}
