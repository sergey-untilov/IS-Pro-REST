package ua.in.d6.domen.root;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

import static ua.in.d6.domen.root.UserRole.USER;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "\"USER\"")
@XmlType(namespace = "http://d6.in.ua", name="user")
public class CustomUser {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_RCD", nullable = false, updatable = false)
    @XmlAttribute
    private long id;

    @Column(name = "User_Nm")
    @XmlAttribute
    private String login;

    @Column(name = "User_FIO")
    @XmlAttribute
    private String name;

    @Column(name = "User_Phn")
    @XmlAttribute
    private String phone;

    @OneToOne(cascade = CascadeType.MERGE)
    @PrimaryKeyJoinColumn
    private UserPassword userPassword;

    public UserRole getRole() {
        return USER;
    }
}
