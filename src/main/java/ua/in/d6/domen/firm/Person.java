package ua.in.d6.domen.firm;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.util.Date;

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

    @Column(name = "Kpu_CdNlp")
    private String taxNumber;

    @Column(name = "Kpu_DtRoj")
    private Date birthDate;

    @Column(name = "Kpu_CdPol")
    private Sex sex;

    @OneToOne(cascade = CascadeType.MERGE)
    @PrimaryKeyJoinColumn
    SalaryAccount salaryAccount;

    @OneToOne(cascade = CascadeType.MERGE)
    @PrimaryKeyJoinColumn
    PersonnelAccount personnelAccount;
}
