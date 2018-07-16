package ua.in.d6.domain.firm;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@Entity
@Getter
@Setter
@Table(name = "CrtFrm1")
@XmlType(name="company", namespace = "http://www.d6.in.ua/schema")
public class Company {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CrtFrm_Rcd", nullable = false, updatable = false)
    @XmlAttribute
    private long id;

    @Column(name = "CrtFrm_Nm", nullable = false)
    @XmlAttribute
    private String name;

    @Column(name = "CrtFrm_LnNm", nullable = false)
    @XmlAttribute
    private String fullName;
}
