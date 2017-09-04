package ua.in.d6.schema;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPersonRequest", propOrder = {"name"}, namespace = "http://d6.in.ua")
public class GetPersonRequest {

    @XmlElement(required = true)
    protected String name;
}
