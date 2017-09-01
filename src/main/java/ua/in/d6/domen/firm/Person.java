package ua.in.d6.domen.firm;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

@Entity
@Getter
@Setter
@Table(name = "KpuC1")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="person", namespace = "http://www.d6.in.ua/schema")
public class Person {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Kpu_Rcd", nullable = false, updatable = false)
    @XmlElement(required = true)
    private long id;

    @Column(name = "Kpu_Fio", nullable = false)
    @XmlElement(required = true)
    private String name;
}
