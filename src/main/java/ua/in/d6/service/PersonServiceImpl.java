package ua.in.d6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.in.d6.domen.firm.Person;
import ua.in.d6.repository.firm.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public Person findByName(String name) {
        return personRepository.findByName(name);
    }

    @Override
    public Person findById(Long id) {
        return personRepository.findById(id);
    }

    @Override
    public void addPerson(Person person) {
        personRepository.save(person);
    }

    @Override
    public void updatePerson(Person person) {
        personRepository.save(person);
    }
}
