package ua.in.d6.domen.firm;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "CrtFrm1")
@XmlType(name="company", namespace = "http://d6.in.ua")
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
