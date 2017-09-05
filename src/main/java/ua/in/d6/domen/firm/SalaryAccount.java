package ua.in.d6.domen.firm;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "KpuX")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="salaryAccount", namespace = "http://d6.in.ua")
public class SalaryAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Kpu_Rcd", nullable = false, updatable = false)
    private long id;

    @Column(name = "Kpu_Tn", nullable = false)
    private long tabNumber;

    @Column(name = "Kpu_TnCo")
    private String corpNumber;

    @Column(name = "Kpu_DatReClc")
    private Date recalcStart;

    @Column(name = "Kpu_Npp")
    private long sequenceNumber;
}
