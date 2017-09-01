package ua.in.d6.schema;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPersonRequest", propOrder = {"name"}, namespace = "http://www.d6.in.ua/schema")
public class GetPersonRequest {

    @XmlElement(required = true)
    protected String name;
}
