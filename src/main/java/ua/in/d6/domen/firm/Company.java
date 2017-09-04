package ua.in.d6.domen.firm;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "CrtFrm1")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="company", namespace = "http://d6.in.ua")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CrtFrm_Rcd", nullable = false, updatable = false)
    private long id;

    @Column(name = "CrtFrm_Nm", nullable = false)
    private String name;

    @Column(name = "CrtFrm_LnNm", nullable = false)
    private String fullName;
}
