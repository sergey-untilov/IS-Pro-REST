package ua.in.d6.domen.firm;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "KpuK1")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="personnelAccount", namespace = "http://d6.in.ua")
public class PersonnelAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Kpu_Rcd", nullable = false, updatable = false)
    private long id;

    @Column(name = "Kpu_Nmr")
    private long cardNumber;
}
