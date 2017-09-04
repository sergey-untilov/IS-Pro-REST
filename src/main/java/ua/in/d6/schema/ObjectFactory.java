package ua.in.d6.schema;

import ua.in.d6.domen.firm.Person;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {}

    public GetPersonRequest createGetPersonRequest() {
        return new GetPersonRequest();
    }

    public GetPersonResponse createGetPersonResponse() {
        return new GetPersonResponse();
    }

    public Person createPerson() {
        return new Person();
    }
}
