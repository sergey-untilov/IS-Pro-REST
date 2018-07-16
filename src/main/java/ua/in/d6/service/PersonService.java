package ua.in.d6.service;

import ua.in.d6.domain.firm.Person;

public interface PersonService {
    Person findByName(String name);
    Person findById(Long id);
    void addPerson(Person person);
    void updatePerson(Person person);
}
