package ua.in.d6.repository.firm;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.in.d6.domen.firm.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
    Person findByName(String name);

    Person findById(Long id);
}
