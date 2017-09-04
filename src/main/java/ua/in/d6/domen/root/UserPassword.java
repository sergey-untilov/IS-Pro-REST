package ua.in.d6.domen.root;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "PU")
public class UserPassword {

    @Id
    @Column(name = "PU_RCD")
    private long id;

    @Column(name = "PU_PwdDate")
    private Date date;

    @Column(name = "PUBlk")
    byte[] passwordBlob;
}
