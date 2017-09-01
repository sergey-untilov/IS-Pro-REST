package ua.in.d6.schema;

import lombok.Getter;
import lombok.Setter;
import ua.in.d6.domen.firm.Person;

import javax.xml.bind.annotation.*;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPersonResponse", propOrder = {"person"}, namespace = "http://www.d6.in.ua/schema")
public class GetPersonResponse {

    @XmlElement(required = true)
    protected Person person;

}
