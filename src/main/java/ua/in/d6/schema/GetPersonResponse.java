package ua.in.d6.schema;

import lombok.Getter;
import lombok.Setter;
import ua.in.d6.domen.firm.Person;

import javax.xml.bind.annotation.*;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"person"})
@XmlRootElement(name = "getPersonResponse", namespace = "http://d6.in.ua")
public class GetPersonResponse {

    @XmlElement(required = true)
    protected Person person;

}
