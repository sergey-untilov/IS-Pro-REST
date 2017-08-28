package ua.in.d6.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import ua.in.d6.GetPersonRequest;
import ua.in.d6.GetPersonResponse;
import ua.in.d6.service.PersonService;

@Endpoint
public class PersonEndpoint {
    private static final String NAMESPACE_URI = "http://d6.in.ua";

    private PersonService personService;

    @Autowired
    public PersonEndpoint(PersonService personService) {
        this.personService = personService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPersonRequest")
    @ResponsePayload
    public GetPersonResponse getPerson(@RequestPayload GetPersonRequest request) {
        GetPersonResponse response = new GetPersonResponse();
        response.setPerson(PersonRepository.findPerson(request.getName()));

        return response;
    }
}