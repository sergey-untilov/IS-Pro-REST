package ua.in.d6.domen.firm;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "KpuC1")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="person", namespace = "http://d6.in.ua")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Kpu_Rcd", nullable = false, updatable = false)
    private long id;

    @Column(name = "Kpu_Fio", nullable = false)
    private String name;
}
