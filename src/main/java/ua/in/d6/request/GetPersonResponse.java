package ua.in.d6.request;

import ua.in.d6.domen.firm.Person;

import javax.xml.bind.annotation.*;

//@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="getPersonResponse", namespace = "http://www.d6.in.ua/person")
//@XmlRootElement(name = "getPersonResponse")
public class GetPersonResponse {

    private static final long serialVersionUID = 1L;

    //@XmlElement(required = true)
    @XmlAttribute
    protected Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
