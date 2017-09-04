package ua.in.d6.schema;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"id", "name"})
@XmlRootElement(name = "getPersonRequest", namespace = "http://d6.in.ua")
public class GetPersonRequest {
    long id;
    protected String name;
}
