package pl.iamkonradkrakowiecki.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.iamkonradkrakowiecki.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {


}
