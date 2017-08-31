package ua.in.d6.domen.firm;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@Entity
@Getter
@Setter
@Table(name = "KpuC1")
@XmlType(name="person", namespace = "http://www.d6.in.ua/person")
public class Person {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Kpu_Rcd", nullable = false, updatable = false)
    @XmlAttribute
    private long id;

    @Column(name = "Kpu_Fio", nullable = false)
    @XmlAttribute
    private String name;
}
