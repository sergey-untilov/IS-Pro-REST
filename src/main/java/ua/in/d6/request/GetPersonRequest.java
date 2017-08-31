package ua.in.d6.request;

import javax.xml.bind.annotation.*;

//@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="GetPersonRequest", namespace = "http://www.d6.in.ua/person")
//@XmlRootElement(name = "getPersonRequest")
public class GetPersonRequest {

    private static final long serialVersionUID = 1L;

    //@XmlElement(required = true)
    @XmlAttribute
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
