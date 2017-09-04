package ua.in.d6.domen.firm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = "http://d6.in.ua", name="sex")
@XmlEnum
public enum Sex {
    UNDEFINED, FEMALE, MALE;

    @Override
    public String toString() {
        return "SEX_" + name();
    }
}
